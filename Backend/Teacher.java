package Backend;
import Resources.TeacherFactory;
import java.util.ArrayList;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Document> documents;
    private String reason = "CLEAR FOR ENTRY";

    public Teacher() {
        super("Teacher" + ((int) (Math.random() * 5) + 1) + ".png", TeacherFactory.generateName(), TeacherFactory.generateIDNumber(), TeacherFactory.generateBirthDate(), TeacherFactory.generateHeight(), TeacherFactory.generateWeight(), "0", TeacherFactory.generateIDExpiration(), TeacherFactory.generateVaccineExpiration());
        if (!super.letThrough()) {
            reason = "EXPIRED ID";
            super.getTeacherID().messUpIDExpiration();
        }
        documents = new ArrayList();
        documents.add(super.getTeacherID());
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public String getReason() {
        return reason;
    }
}