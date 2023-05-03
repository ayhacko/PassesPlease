package Frontend;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;

import Backend.*;
import Resources.Images.*;

public class GamePanel extends JPanel implements ActionListener, MouseListener {
    private GameManager manager;

    public GamePanel(GameManager manager) {
        this.manager = manager;
    }

    @Override
    public void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(new Color(100, 100, 0));
        g.fillRect(0, 0, 1280, 720);
        g.drawImage(Images.toBufferedImage(Images.loadImage("upper_map.png").getScaledInstance(1280, 240, Image.SCALE_DEFAULT)), null, 0, 0);
        g.drawImage(Images.toBufferedImage(Images.loadImage("lower_left.png").getScaledInstance(430, 480, Image.SCALE_DEFAULT)), null, 0, 240);
        g.drawImage(Images.toBufferedImage(Images.loadImage("desk.png").getScaledInstance(880, 480, Image.SCALE_DEFAULT)), null, 430, 240);
        g.drawImage(Images.toBufferedImage(Images.loadImage("IDCard.png").getScaledInstance(300, 200, Image.SCALE_DEFAULT)), null, 430, 240);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
