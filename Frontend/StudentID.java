package Frontend;

import java.awt.*;
import java.awt.image.*;
import Resources.Images.*;

public class StudentID extends Document {
    //public final BufferedImage image = Images.loadImage();
    public StudentID(Coordinate position) {
        super(null, null);
    }

    @Override
    public boolean onComponent(Coordinate coordinate) {
        return false;
    }

    @Override
    public void draw(Graphics2D g) {

    }
}
