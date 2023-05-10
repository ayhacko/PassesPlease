package Backend;

import Resources.*;
import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Document> documents;

    public Student() {
        super(StudentFactory.generateName(), StudentFactory.generateIDNumber(), StudentFactory.generateBirthDate(), StudentFactory.generateHeight(), StudentFactory.generateWeight(), StudentFactory.generateGrade(), StudentFactory.generateIDExpiration(), StudentFactory.generateVaccineExpiration());
        if (!super.letThrough()) {
            double seed = Math.random();
            if (seed < 0.125) {
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
            } else if (seed < 0.25) {
                if (Math.random() < 0.5) {
                    super.getStudentID().messUpName();
                } else {
                    super.getMediaPass().messUpName();
                }
            } else if (seed < 0.375) {
                double rand = Math.random();
                if (rand < 0.33) {
                    super.getStudentID().messUpIDNumber();
                } else if (rand < 0.66) {
                    super.getEaglePass().messUpIDNumber();
                } else {
                    super.getSupplement().messUpIDNumber();
                }
            } else if (seed < 0.5) {
                if (Math.random() < 0.5) {
                    super.getStudentID().messUpBirthDate();
                } else {
                    super.getSupplement().messUpBirthDate();
                }
            } else if (seed < 0.625) {
                if (Math.random() < 0.5) {
                    super.getStudentID().messUpHeight();
                } else {
                    super.getEaglePass().messUpHeight();
                }
            } else if (seed < 0.75) {
                if (Math.random() < 0.5) {
                    super.getStudentID().messUpWeight();
                } else {
                    super.getEaglePass().messUpWeight();
                }
            } else if (seed < 0.875) {
                super.getStudentID().messUpIDExpiration();
            } else {
                super.getSupplement().messUpVaccineExpiration();
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
