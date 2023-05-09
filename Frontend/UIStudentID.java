package Frontend;

import java.awt.*;
import java.awt.image.*;
import Resources.Images.*;
public class UIStudentID extends UIDocument {
    private static final int EXPANDED_WIDTH = 300;
    private static final int EXPANDED_HEIGHT = 200;
    public UIStudentID(Coordinate position) {
        super(position, null);
    }

    @Override
    public boolean onComponent(Coordinate coordinate) {
        return (coordinate.getX() >= getPosition().getX()) && (coordinate.getY() >= getPosition().getY()) && (coordinate.getX() <= getPosition().getX() + EXPANDED_WIDTH) && (coordinate.getY() <= getPosition().getY() + EXPANDED_HEIGHT);
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(Images.toBufferedImage(Images.loadImage("IDCard.png").getScaledInstance(EXPANDED_WIDTH, EXPANDED_HEIGHT, Image.SCALE_DEFAULT)), null, getPosition().getX(), getPosition().getY());
    }
}


