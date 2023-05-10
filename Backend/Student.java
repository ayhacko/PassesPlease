package Backend;

import Resources.*;
import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Document> documents;

    public Student() {
        super(StudentFactory.generateName(), StudentFactory.generateIDNumber(), StudentFactory.generateBirthDate(), StudentFactory.generateHeight(), StudentFactory.generateWeight(), StudentFactory.generateGrade(), StudentFactory.generateIDExpiration(), StudentFactory.generateVaccineExpiration());
        if (!super.letThrough()) {
            if () {
                double rand = Math.random();
                if (rand < 0.25) {
                    super.setStudentID(null);
                } else if (rand < 0.5) {
                    super.setEaglePass(null);
                } else if (rand < 0.75) {
                    super.setMediaPass(null);
                } else {
                    super.setSupplement(null);
                }
            } else if () {
                if (Math.random() < 0.5) {
                    super.getStudentID().messUpName();
                } else {
                    super.getMediaPass().messUpName();
                }
            } else if () {
                double rand = Math.random();
                if (rand < 0.33) {
                    super.getStudentID().messUpIDNumber();
                } else if (rand < 0.66) {
                    super.getEaglePass().messUpIDNumber();
                } else {
                    super.getSupplement().messUpIDNumber();
                }
            } else if () {
                if () {
                    super.getStudentID().messUpBirthDate();
                } else if () {
                    super.getSupplement().messUpBirthDate();
                }
            }
        }
        documents = new ArrayList();
        if (super.getStudentID() != null)
            documents.add(super.getStudentID());
        if (super.getEaglePass() != null)
            documents.add(super.getEaglePass());
        if (super.getMediaPass() != null)
            documents.add(super.getMediaPass());
        if (super.getSupplement() != null)
            documents.add(super.getSupplement());
    }
}
