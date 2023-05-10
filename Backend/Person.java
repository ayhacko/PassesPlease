package Backend;

import java.util.ArrayList;

public abstract class Person {
    private String name;
    private String idNumber;
    private String birthDate;
    private String height;
    private String weight;
    private String idExpiration;
    private String passDay;
    private String permitDay;
    private ArrayList<String> diseases;
    private String vaccineExpiration;
    private ArrayList<Document> documents;
    private boolean letThrough;

    public Person(String name, String idNumber, String birthDate, String height, String weight, String idExpiration, String passDay, ArrayList<String> tests, String permitDay, ArrayList<String> diseases, String vaccineExpiration, ArrayList<Document> documents) {
        StudentID id = new StudentID()
        letThrough = Math.random() <= 0.33;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
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

    public String getIdExpiration() {
        return idExpiration;
    }

    public String getPassDay() {
        return passDay;
    }

    public ArrayList<String> getTests() {
        return tests;
    }

    public String getPermitDay() {
        return permitDay;
    }

    public ArrayList<String> getDiseases() {
        return diseases;
    }

    public String getVaccineExpiration() {
        return vaccineExpiration;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public boolean isLetThrough() {
        return letThrough;
    }
}
