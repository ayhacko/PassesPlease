package Backend;
import Resources.TeacherFactory;
import java.util.ArrayList;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Document> documents;

    public Teacher() {
        super(TeacherFactory.generateName(), TeacherFactory.generateIDNumber(), TeacherFactory.generateBirthDate(), TeacherFactory.generateHeight(), TeacherFactory.generateWeight(), "0", TeacherFactory.generateIDExpiration(), TeacherFactory.generateVaccineExpiration());
        if (!super.letThrough()) {
            super.getTeacherID().messUpIDExpiration();
        }
        documents = new ArrayList();
        documents.add(super.getTeacherID());
    }
}