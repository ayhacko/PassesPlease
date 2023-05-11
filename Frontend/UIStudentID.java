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
                g.setColor(Color.BLACK);
                g.setFont(Fonts.loadFont(Fonts.SPY, 30));
                g.drawString(((StudentID) getDocument()).getGrade(), getPosition().getX() + 40, getPosition().getY() + 40);
            } else {
                g.drawImage(Images.toBufferedImage(Images.loadImage("studentID_small.png").getScaledInstance(EXPANDED_WIDTH_SMALL, EXPANDED_HEIGHT_SMALL, Image.SCALE_DEFAULT)), null, getPosition().getX(), getPosition().getY());
            }
        }
    }
}


