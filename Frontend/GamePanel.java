package Frontend;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import Backend.*;
import Resources.Images.*;

public class GamePanel extends JPanel implements ActionListener {
    private GameManager manager;
    private Timer timer;
    private ArrayList<UIDocument> documents;
    private UIDocument document;
    private Coordinate wherePressed;
    private UIPerson uiPerson;

    public GamePanel(GameManager manager) {
        this.manager = manager;
        MouseHandler handler = new MouseHandler();
        this.addMouseListener(handler);
        this.addMouseMotionListener(handler);
        //uiPerson = new UIPerson()
        documents.add(new UIStudentID(new Coordinate(430, 240)));
        timer = new Timer(1000, this);
    }

    public void startTimer() {
        timer.start();
    }

    public void stopTimer() {
        timer.stop();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(new Color(100, 100, 0));
        g.fillRect(0, 0, 1280, 720);
        g.drawImage(Images.toBufferedImage(Images.loadImage("lower_left.png").getScaledInstance(430, 480, Image.SCALE_DEFAULT)), null, 0, 240);
        g.drawImage(Images.toBufferedImage(Images.loadImage("desk.png").getScaledInstance(880, 480, Image.SCALE_DEFAULT)), null, 430, 240);
        g.drawImage(Images.toBufferedImage(Images.loadImage("bell.png").getScaledInstance(150, 225, Image.SCALE_DEFAULT)), null, 1150, 180);
        for (UIDocument doc : documents) {
            doc.draw(g);
        }
    }

    public void giveDocuments(Graphics2D g) {
        uiPerson.drawDocuments(g);
    }

    /*
    public void returnedDocuments() {
        if (manager.validDocuments()) {
            uiPerson.fadeOut();
            manager.nextPerson();
        }
    }
    */


    public void newUIPerson(Person person) {
        uiPerson = new UIPerson(person);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        manager.decreaseTime();
        if (manager.getTime() <= 0) {
            timer.stop();
        }
        System.out.println(manager.getTime());
    }

    public class MouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            boolean documentClicked = false;
            for (int i = documents.size() - 1; i >= 0; i--) {
                if (documents.get(i).onComponent(new Coordinate(e.getX(), e.getY()))) {
                    wherePressed = new Coordinate(e.getX(), e.getY());
                    documentClicked = true;
                    document = documents.remove(i);
                    documents.add(document);
                    break;
                }
            }
            if (!documentClicked) {
                document = null;
            }
        }
        @Override
        public void mouseDragged(MouseEvent e) {
            if (wherePressed != null && document != null) {
                Coordinate movement = new Coordinate(e.getX() - wherePressed.getX(), e.getY() - wherePressed.getY());
                wherePressed = new Coordinate(e.getX(), e.getY());
                document.moveBy(movement.getX(), movement.getY());
                repaint();
            }
        }
    }
}
