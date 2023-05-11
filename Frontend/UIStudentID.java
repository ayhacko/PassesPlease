package Frontend;

import java.awt.*;
import java.awt.image.*;

import Backend.*;
import Resources.Fonts.Fonts;
import Resources.Images.*;

public class UIStudentID extends UIDocument {
    private static final int EXPANDED_WIDTH = 300;
    private static final int EXPANDED_HEIGHT = 200;
    private static final int EXPANDED_HEIGHT_SMALL = 66;
    private static final int EXPANDED_WIDTH_SMALL = 100;
    public UIStudentID(Coordinate position, Document document) {
        super(position, document);
    }

    @Override
    public boolean onComponent(Coordinate coordinate) {
        if (!getReturned()) {
            if (coordinate.getX() > 410) {
                return (coordinate.getX() >= getPosition().getX()) && (coordinate.getY() >= getPosition().getY()) && (coordinate.getX() <= getPosition().getX() + EXPANDED_WIDTH) && (coordinate.getY() <= getPosition().getY() + EXPANDED_HEIGHT);
            } else {
                return (coordinate.getX() >= getPosition().getX()) && (coordinate.getY() >= getPosition().getY()) && (coordinate.getX() <= getPosition().getX() + EXPANDED_WIDTH_SMALL) && (coordinate.getY() <= getPosition().getY() + EXPANDED_HEIGHT_SMALL);
            }
        }
        return false;
    }

    @Override
    public void draw(Graphics2D g) {
        if (!getReturned()) {
            if (getPosition().getX() > 410) {
                g.drawImage(Images.toBufferedImage(Images.loadImage("IDCard.png").getScaledInstance(EXPANDED_WIDTH, EXPANDED_HEIGHT, Image.SCALE_DEFAULT)), null, getPosition().getX(), getPosition().getY());
                g.setColor(Color.GRAY);
                g.setFont(Fonts.loadFont(Fonts.SPY, 20));
                g.drawString("Name: " + ((StudentID) getDocument()).getName(), getPosition().getX() + 110, getPosition().getY() + 60);
                g.drawString("ID: " + ((StudentID) getDocument()).getIDNumber(), getPosition().getX() + 110, getPosition().getY() + 80);
                g.drawString("DoB: " + ((StudentID) getDocument()).getBirthDate(), getPosition().getX() + 110, getPosition().getY() + 100);
                g.drawString("Exp.: " + ((StudentID) getDocument()).getIDExpiration(), getPosition().getX() + 110, getPosition().getY() + 120);
                g.drawString("Height: " + ((StudentID) getDocument()).getHeight() + " cm", getPosition().getX() + 110, getPosition().getY() + 140);
                g.drawString(((StudentID) getDocument()).getGrade(), getPosition().getX() + 40, getPosition().getY() + 40);
                g.drawImage(Images.toBufferedImage(Images.loadImage(((StudentID) getDocument()).getImageString()).getScaledInstance(100, 100, Image.SCALE_DEFAULT)), null, getPosition().getX()+5, getPosition().getY()+45);
                g.drawString(((StudentID) getDocument()).getWeight(), 340 , 693);



            } else {
                g.drawImage(Images.toBufferedImage(Images.loadImage("studentID_small.png").getScaledInstance(EXPANDED_WIDTH_SMALL, EXPANDED_HEIGHT_SMALL, Image.SCALE_DEFAULT)), null, getPosition().getX(), getPosition().getY());
            }
        }
    }
}


