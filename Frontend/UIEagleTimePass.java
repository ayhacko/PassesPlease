package Frontend;

import Backend.Document;
import Resources.Images.Images;

import java.awt.*;

public class UIEagleTimePass extends UIDocument{
    private static final int EXPANDED_WIDTH = 200;
    private static final int EXPANDED_HEIGHT = 120;
    private static final int EXPANDED_HEIGHT_SMALL = 60;
    private static final int EXPANDED_WIDTH_SMALL = 100;
    public UIEagleTimePass(Coordinate position, Document document) {
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
                g.drawImage(Images.toBufferedImage(Images.loadImage("eagle_time_pass.png").getScaledInstance(EXPANDED_WIDTH, EXPANDED_HEIGHT, Image.SCALE_DEFAULT)), null, getPosition().getX(), getPosition().getY());
            } else {
                g.drawImage(Images.toBufferedImage(Images.loadImage("eagle_time_pass_small.png").getScaledInstance(EXPANDED_WIDTH_SMALL, EXPANDED_HEIGHT_SMALL, Image.SCALE_DEFAULT)), null, getPosition().getX(), getPosition().getY());
            }
        }
    }

}
