package Frontend;

import java.awt.*;

public abstract class Document {
    private Coordinate position;
    private boolean expanded;

    public Document(Coordinate position) {
        this.position = position;
        expanded = false;
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

    public void moveBy(int x, int y) {
        position = new Coordinate(position.getX() + x, position.getY() + y);
    }

    public abstract boolean onComponent(Coordinate coordinate);
    public abstract void draw(Graphics2D g);
}
