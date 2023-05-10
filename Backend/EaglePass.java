package Backend;

public class EaglePass extends Document{
    private String idNumber;
    private String height;
    private String weight;

    public EaglePass(String idNumber, String height, String weight) {
        this.idNumber = idNumber;
        this.height = height;
        this.weight = weight;
    }

    public void messUpIDNumber() {
        String temp = idNumber;
        int typoPlacement = (int) (Math.random() * idNumber.length());
        while (temp.equals(idNumber)) {
            temp = "";
            for (int i = 0; i < 7; i++) {
                if (i == typoPlacement)
                    temp += (int) (Math.random() * 10);
                else
                    temp += idNumber.substring(i, i+1);
            }
        }
        idNumber = temp;
    }

    public void messUpHeight() {
        String temp = height;
        while (temp.equals(height)) {
            temp = "" + ((int) (Math.random() * 100) + 100);
        }
        height = temp;
    }

    public void messUpWeight() {
        String temp = weight;
        while (temp.equals(weight)) {
            temp = "" + ((int) (Math.random() * 100) + 100);
        }
        weight = temp;
    }

    public String getIDNumber() {
        return idNumber;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }
}
