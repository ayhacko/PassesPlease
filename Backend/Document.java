package Backend;

public abstract class Document {
    public boolean returned;

    public Document() {
        returned = false;
    }

    public boolean getReturned() {
        return returned;
    }

    public void setReturned() {
        returned = true;
    }
}
