package Backend;

public class MediaPass extends Document {
    private String name;

    public MediaPass(String name) {
        this.name = name;
    }

    public void messUpName() {
        int typoPlacement = (int) (Math.random() * name.length());
        name = name.substring(0, typoPlacement) + "i" + name.substring(typoPlacement);
    }
}
