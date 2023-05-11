package Frontend;

import Backend.*;
import Resources.Fonts.Fonts;
import Resources.Images.Images;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TutorialPanel extends JPanel implements MouseListener {
    private GameManager manager;
    private int slide;

    public TutorialPanel(GameManager manager) {
        this.manager = manager;
        slide = 1;
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.drawImage(Images.toBufferedImage(Images.loadImage("tutorial" + slide + ".png").getScaledInstance(1280, 745, Image.SCALE_DEFAULT)), null, 0, 0);
        g.setColor(Color.GRAY);
        g.setFont(Fonts.loadFont(Fonts.SPY, 30));
        g.drawString("Click anywhere to continue", 900, 700);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        slide++;
        if (slide > 6) {
            manager.setGameState(GameState.GAMEPLAY);
        }
        repaint();
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
