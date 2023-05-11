package Backend;

import Resources.*;
import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Document> documents;
    private String reason = "CLEAR FOR ENTRY";

    public Student() {
        super("Student" + ((int) (Math.random() * 12) + 1) + ".png", StudentFactory.generateName(), StudentFactory.generateIDNumber(), StudentFactory.generateBirthDate(), StudentFactory.generateHeight(), StudentFactory.generateWeight(), StudentFactory.generateGrade(), StudentFactory.generateIDExpiration(), StudentFactory.generateVaccineExpiration());
        if (!super.letThrough()) {
            double seed = Math.random();
            if (seed < 0.125) {
                double rand = Math.random();
                if (rand < 0.25) {
                    reason = "NO ID";
                    super.setStudentID(null);
                } else if (rand < 0.5) {
                    reason = "NO EAGLE PASS";
                    super.setEaglePass(null);
                } else if (rand < 0.75) {
                    reason = "NO MEDIA PASS";
                    super.setMediaPass(null);
                } else {
                    reason = "NO VACCINE SUPPLEMENT";
                    super.setSupplement(null);
                }
            } else if (seed < 0.25) {
                if (Math.random() < 0.5) {
                    reason = "INVALID NAME";
                    super.getStudentID().messUpName();
                } else {
                    reason = "INVALID NAME";
                    super.getMediaPass().messUpName();
                }
            } else if (seed < 0.375) {
                double rand = Math.random();
                if (rand < 0.33) {
                    reason = "INVALID ID";
                    super.getStudentID().messUpIDNumber();
                } else if (rand < 0.66) {
                    reason = "INVALID ID";
                    super.getEaglePass().messUpIDNumber();
                } else {
                    reason = "INVALID ID";
                    super.getSupplement().messUpIDNumber();
                }
            } else if (seed < 0.5) {
                if (Math.random() < 0.5) {
                    reason = "INVALID BIRTH DATE";
                    super.getStudentID().messUpBirthDate();
                } else {
                    reason = "INVALID BIRTH DATE";
                    super.getSupplement().messUpBirthDate();
                }
            } else if (seed < 0.625) {
                if (Math.random() < 0.5) {
                    reason = "INVALID HEIGHT";
                    super.getStudentID().messUpHeight();
                } else {
                    reason = "INVALID HEIGHT";
                    super.getEaglePass().messUpHeight();
                }
            } else if (seed < 0.75) {
                if (Math.random() < 0.5) {
                    reason = "INVALID WEIGHT";
                    super.getStudentID().messUpWeight();
                } else {
                    reason = "INVALID WEIGHT";
                    super.getEaglePass().messUpWeight();
                }
            } else if (seed < 0.875) {
                reason = "EXPIRED ID";
                super.getStudentID().messUpIDExpiration();
            } else {
                reason = "EXPIRED SUPPLEMENT";
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

    public ArrayList<Document> getDocuments() {
        return documents;
    }
    public String getReason() {
        return reason;
    }
}
