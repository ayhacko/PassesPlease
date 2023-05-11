package Frontend;

import java.awt.*;
import Backend.*;

public abstract class UIDocument {
    private Coordinate position;
    private boolean expanded;
    private Document document;

    public UIDocument(Coordinate position, Document document) {
        this.position = position;
        this.document = document;
        expanded = false;
    }

    public Coordinate getPosition() {
        return position;
    }

    public boolean getReturned() {
        return document.getReturned();
    }

    public void setReturned() {
        document.setReturned();
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
