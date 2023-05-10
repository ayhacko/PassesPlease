package Backend;

public abstract class Document {
    public boolean returned;

    public Document() {
        returned = false;
    }

    public void setReturned() {
        returned = true;
    }
}
