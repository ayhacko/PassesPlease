package Frontend;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import Backend.*;
import Resources.Fonts.Fonts;
import Resources.Images.*;

public class GamePanel extends JPanel implements ActionListener {
    private GameManager manager;
    private Timer timer;
    private double timeElapsed;
    private UIDocument document;
    private Coordinate wherePressed;
    private UIPerson uiPerson;

    public GamePanel(GameManager manager) {
        this.manager = manager;
        uiPerson = new UIPerson(manager.getPerson());
        MouseHandler handler = new MouseHandler();
        this.addMouseListener(handler);
        this.addMouseMotionListener(handler);
        timer = new Timer(1000, this);
        timeElapsed = 0;
    }

    public void setUIPerson(Person person) {
        uiPerson = new UIPerson(person);
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
        g.drawImage(Images.toBufferedImage(Images.loadImage("upper_map.png").getScaledInstance(1280, 240, Image.SCALE_DEFAULT)), null, 0, 0);
        g.drawImage(Images.toBufferedImage(Images.loadImage("lower_left.png").getScaledInstance(430, 480, Image.SCALE_DEFAULT)), null, 0, 240);
        g.drawImage(Images.toBufferedImage(Images.loadImage("desk.png").getScaledInstance(880, 480, Image.SCALE_DEFAULT)), null, 430, 240);
        g.drawImage(Images.toBufferedImage(Images.loadImage("bell.png").getScaledInstance(250, 320, Image.SCALE_DEFAULT)), null, 1100, 160);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 240, 150, 40);
        g.setColor(Color.GRAY);
        g.setFont(Fonts.loadFont(Fonts.SPY, 30));
        g.drawString(manager.DATE, 10, 270);
        g.setFont(Fonts.loadFont(Fonts.SPY, 40));
        if (manager.getTime() % 60 > 9)
            g.drawString((manager.getTime() / 60) + ":" + (manager.getTime() % 60), 30, 690);
        else
            g.drawString((manager.getTime() / 60) + ":0" + (manager.getTime() % 60), 30, 690);
        g.drawString(manager.getScore() + "", 310, 695);
        g.setFont(Fonts.loadFont(Fonts.SPY, 30));
        FontMetrics metrics = g.getFontMetrics(Fonts.loadFont(Fonts.SPY, (float) 30));
        g.drawString(manager.getDiscrepancy(), (880 - metrics.stringWidth(manager.getDiscrepancy())) / 2 + 430, 690);
        uiPerson.draw(g);
        uiPerson.drawDocuments(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        manager.decreaseTime();
        repaint();
    }

    public class MouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            boolean documentClicked = false;
            if (e.getX() >= 1190 && e.getY() >= 330 && e.getX() <= 1245 && e.getY() <= 390) {
                manager.setDecision(false);
                manager.nextPerson();
            } else {
                ArrayList<UIDocument> documents = uiPerson.getDocuments();
                for (int i = documents.size() - 1; i >= 0; i--) {
                    if (documents.get(i).onComponent(new Coordinate(e.getX(), e.getY()))) {
                        wherePressed = new Coordinate(e.getX(), e.getY());
                        documentClicked = true;
                        document = documents.remove(i);
                        documents.add(document);
                        break;
                    }
                }
            }
            if (!documentClicked) {
                document = null;
            }
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            if (document != null && e.getX() < 430 && e.getY() > 240 && e.getY() < 500) {
                document.setReturned();
                boolean allReturned = true;
                for (UIDocument doc : uiPerson.getDocuments()) {
                    if (!doc.getReturned()) {
                        allReturned = false;
                    }
                }
                if (allReturned) {
                    manager.setDecision(true);
                    manager.nextPerson();
                }
            }
            repaint();
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
