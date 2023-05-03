package Frontend;

import java.awt.*;
import java.awt.image.*;

public abstract class Document {
    private BufferedImage image;
    private Coordinate position;
    private boolean expanded;

    public Document(BufferedImage image, Coordinate position) {
        this.image = image;
        expanded = false;
    }

    public BufferedImage getImage() {
        return image;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public boolean getExpanded() {
        return expanded;
    }

    public void expand() {
        expanded = true;
    }

    public void minimize() {
        expanded = false;
    }

    public void moveTo(Coordinate coordinate) {
        position = coordinate;
    }

    public abstract boolean onComponent(Coordinate coordinate);
    public abstract void draw(Graphics2D g);
}
