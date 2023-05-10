package Backend;

public class TeacherID extends Document {
    private String name;
    private String idNumber;
    private String birthDate;
    private String height;
    private String weight;
    private String idExpiration;

    public TeacherID(String name, String idNumber, String birthDate, String height, String weight, String idExpiration) {
        this.name = name;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.idExpiration = idExpiration;
    }

    public void messUpIDExpiration() {
        int year = 89;
        int month = 8;
        int day = (int) (Math.random() * 28) + 1;
        idExpiration = month + "-" + day + "-" + year;
    }

    public String getName() {
        return name;
    }

    public String getIDNumber() {
        return idNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getIDExpiration() {
        return idExpiration;
    }
}
