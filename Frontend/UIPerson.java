package Frontend;

import Backend.*;
import Resources.Images.Images;

import java.awt.*;
import java.util.ArrayList;

public class UIPerson {
    private Person person;
    private ArrayList<UIDocument> documents;

    public UIPerson(Person person) {
        this.person = person;
        documents = new ArrayList();
        for (Document doc : person.getDocuments()) {
            if (doc instanceof EaglePass) {
                documents.add(new UIEagleTimePass(new Coordinate(0, 0), doc));
            } else if (doc instanceof MediaPass) {
                documents.add(new UIMediaPass(new Coordinate(0, 0), doc));
            } else if (doc instanceof StudentID) {
                documents.add(new UIStudentID(new Coordinate(0, 0), doc));
            } else if (doc instanceof TeacherID) {
                documents.add(new UITeacherID(new Coordinate(0, 0), doc));
            } else {
                documents.add(new UIVaccinationCard(new Coordinate(0, 0), doc));
            }
        }
    }

    public ArrayList<UIDocument> getDocuments() {
        return documents;
    }

    public void draw(Graphics2D g) {
        g.drawImage(Images.toBufferedImage(Images.loadImage(person.getImageString()).getScaledInstance(250, 250, Image.SCALE_DEFAULT)), null, 100, 285);
    }

    public void drawDocuments(Graphics2D g) {
        for (UIDocument doc : documents) {
            doc.draw(g);
        }
    }

    public void fadeIn() {

    }

    public void fadeOut() {

    }
}
