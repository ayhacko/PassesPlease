package Frontend;

import javax.swing.*;
import Backend.*;
import Resources.Fonts.Fonts;
import Resources.Images.Images;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EndPanel extends JPanel implements MouseListener {
    PassesPlease game;

    private GameManager manager;

    public EndPanel(GameManager manager, PassesPlease game) {
        this.manager = manager;
        this.game = game;
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.drawImage(Images.toBufferedImage(Images.loadImage("end_background.png").getScaledInstance(1280, 745, Image.SCALE_DEFAULT)), null, 0, 0);
        g.setColor(Color.WHITE);
        g.setFont(Fonts.loadFont(Fonts.SPY, 40));
        FontMetrics metrics = g.getFontMetrics(Fonts.loadFont(Fonts.SPY, (float) 40));
        g.drawString("Your score: " + manager.getScore(), (getWidth() - metrics.stringWidth("Your score: " + manager.getScore())) / 2, 375);
        g.setColor(Color.GRAY);
        g.setFont(Fonts.loadFont(Fonts.SPY, 30));
        g.drawString("Click anywhere to try again", 450, 600);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        game.reset();
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
