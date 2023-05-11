package Backend;

public class StudentID extends Document {
    private String imageString;
    private String name;
    private String idNumber;
    private String birthDate;
    private String height;
    private String weight;
    private String grade;
    private String idExpiration;

    public StudentID(String name, String idNumber, String birthDate, String height, String weight, String grade, String idExpiration, String imageString) {
        this.name = name;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.grade = grade;
        this.idExpiration = idExpiration;
        this.imageString = imageString;
    }

    public void messUpName() {
        int typoPlacement = (int) (Math.random() * name.length());
        name = name.substring(0, typoPlacement) + "i" + name.substring(typoPlacement);
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

    public void messUpBirthDate() {
        String temp = birthDate;
        while (temp.equals(birthDate)) {
            int year = (int) (Math.random() * 5) + 2071;
            int month = (int) (Math.random() * 12) + 1;
            int day = (int) (Math.random() * 28) + 1;
            temp = year + "-" + month + "-" + day;
        }
        birthDate = temp;
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

    public void messUpGrade() {
        String temp = grade;
        while (temp.equals(grade)) {
            temp = "" + ((int) (Math.random() * 4) + 9);
        }
        grade = temp;
    }

    public void messUpIDExpiration() {
        int year = 89;
        int month = 8;
        int day = (int) (Math.random() * 28) + 1;
        idExpiration = month + "-" + day + "-" + year;
    }

    public String getImageString(){return imageString;}
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

    public String getGrade() {
        return grade;
    }

    public String getIDExpiration() {
        return idExpiration;
    }
}
