package Frontend;

import java.awt.*;
import java.awt.image.*;
import Resources.Images.*;
public class UIStudentID extends UIDocument {
    private static final int EXPANDED_WIDTH = 300;
    private static final int EXPANDED_HEIGHT = 200;
    private static final int EXPANDED_HEIGHT_SMALL = 66;
    private static final int EXPANDED_WIDTH_SMALL = 100;
    public UIStudentID(Coordinate position) {
        super(position, null);
    }

    @Override
    public boolean onComponent(Coordinate coordinate) {
        if(coordinate.getX() > 410){
            return (coordinate.getX() >= getPosition().getX()) && (coordinate.getY() >= getPosition().getY()) && (coordinate.getX() <= getPosition().getX() + EXPANDED_WIDTH) && (coordinate.getY() <= getPosition().getY() + EXPANDED_HEIGHT);
        }else{
            return (coordinate.getX() >= getPosition().getX()) && (coordinate.getY() >= getPosition().getY()) && (coordinate.getX() <= getPosition().getX() + EXPANDED_WIDTH_SMALL) && (coordinate.getY() <= getPosition().getY() + EXPANDED_HEIGHT_SMALL);
        }


    }

    @Override
    public void draw(Graphics2D g) {
        if(getPosition().getX() > 410){
            g.drawImage(Images.toBufferedImage(Images.loadImage("IDCard.png").getScaledInstance(EXPANDED_WIDTH, EXPANDED_HEIGHT, Image.SCALE_DEFAULT)), null, getPosition().getX(), getPosition().getY());
        }else{
            g.drawImage(Images.toBufferedImage(Images.loadImage("studentID_small.png").getScaledInstance(EXPANDED_WIDTH_SMALL, EXPANDED_HEIGHT_SMALL, Image.SCALE_DEFAULT)), null, getPosition().getX(), getPosition().getY());
        }

    }
}


