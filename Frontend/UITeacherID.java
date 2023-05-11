package Frontend;

import Backend.Document;
import Backend.StudentID;
import Backend.Teacher;
import Backend.TeacherID;
import Resources.Fonts.Fonts;
import Resources.Images.Images;

import java.awt.*;

public class UITeacherID extends UIDocument{

    private static final int EXPANDED_WIDTH = 300;
    private static final int EXPANDED_HEIGHT = 200;
    private static final int EXPANDED_HEIGHT_SMALL = 66;
    private static final int EXPANDED_WIDTH_SMALL = 100;
    public UITeacherID(Coordinate position, Document document) {
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
                g.drawImage(Images.toBufferedImage(Images.loadImage("teacher_ID.png").getScaledInstance(EXPANDED_WIDTH, EXPANDED_HEIGHT, Image.SCALE_DEFAULT)), null, getPosition().getX(), getPosition().getY());
                g.setColor(Color.GRAY);
                g.setFont(Fonts.loadFont(Fonts.SPY, 20));
                g.drawString("Name: " + ((TeacherID) getDocument()).getName(), getPosition().getX() + 110, getPosition().getY() + 60);
                g.drawString("ID: " + ((TeacherID) getDocument()).getIDNumber(), getPosition().getX() + 110, getPosition().getY() + 80);
                g.drawString("DoB: " + ((TeacherID) getDocument()).getBirthDate(), getPosition().getX() + 110, getPosition().getY() + 100);
                g.drawString("Exp.: " + ((TeacherID) getDocument()).getIDExpiration(), getPosition().getX() + 110, getPosition().getY() + 120);
                g.drawString("Height: " + ((TeacherID) getDocument()).getHeight() + "cm", getPosition().getX() + 110, getPosition().getY() + 140);
                g.drawImage(Images.toBufferedImage(Images.loadImage(((TeacherID) getDocument()).getImageString()).getScaledInstance(100, 100, Image.SCALE_DEFAULT)), null, getPosition().getX()+5, getPosition().getY()+45);
                g.drawString(((TeacherID) getDocument()).getWeight(),340,693);



            } else {
                g.drawImage(Images.toBufferedImage(Images.loadImage("teacher_ID_small.png").getScaledInstance(EXPANDED_WIDTH_SMALL, EXPANDED_HEIGHT_SMALL, Image.SCALE_DEFAULT)), null, getPosition().getX(), getPosition().getY());
            }
        }
    }

}
