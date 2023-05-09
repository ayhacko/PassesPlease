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
    private ArrayList<String> tests;
    private String permitDay;
    private ArrayList<String> diseases;
    private String vaccineExpiration;
    private ArrayList<Document> documents;
    private boolean letThrough;

    public Person(String name, String idNumber, String birthDate, String height, String weight, String idExpiration, String passDay, ArrayList<String> tests, String permitDay, ArrayList<String> diseases, String vaccineExpiration, ArrayList<Document> documents) {
        letThrough = Math.random() <= 0.33;
    }
}
