package Frontend;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import Backend.*;
import Resources.Images.*;

public class GamePanel extends JPanel implements ActionListener {
    private GameManager manager;
    private ArrayList<Document> documents;
    private Document document;
    private Coordinate wherePressed;

    public GamePanel(GameManager manager) {
        this.manager = manager;
        MouseHandler handler = new MouseHandler();
        this.addMouseListener(handler);
        this.addMouseMotionListener(handler);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(new Color(100, 100, 0));
        g.fillRect(0, 0, 1280, 720);
        g.drawImage(Images.toBufferedImage(Images.loadImage("upper_map.png").getScaledInstance(1280, 240, Image.SCALE_DEFAULT)), null, 0, 0);
        g.drawImage(Images.toBufferedImage(Images.loadImage("lower_left.png").getScaledInstance(430, 480, Image.SCALE_DEFAULT)), null, 0, 240);
        g.drawImage(Images.toBufferedImage(Images.loadImage("table.png").getScaledInstance(880, 480, Image.SCALE_DEFAULT)), null, 430, 240);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            boolean documentClicked = false;
            for (int i = 0; i < documents.size(); i++) {
                if (documents.get(i).onComponent(new Coordinate(e.getX(), e.getY()))) {
                    documentClicked = true;
                    document = documents.remove(documents.size() - 1);
                    documents.add(0, document);
                    break;
                }
            }
            if (!documentClicked) {
                document = null;
            }
        }
        @Override
        public void mouseDragged(MouseEvent e) {
            if (document != null) {
                document.moveTo(new Coordinate(e.getX() - wherePressed.getX(), e.getY() - wherePressed.getY()));
            }
        }
    }
}
