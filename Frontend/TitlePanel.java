package Frontend;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Backend.*;
import Resources.Images.Images;
import Resources.Fonts.Fonts;

public class TitlePanel extends JPanel implements ActionListener, MouseListener {
    private GameManager manager;
    private Graphics2D g;
    private int y = 200;
    boolean toggle = false;
    private Timer timer;

    public TitlePanel(GameManager manager) {
        this.manager = manager;
        addMouseListener(this);
        timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        this.g = g;
        g.drawImage(Images.loadImage("title_screen.png"), null, 0, 0);
        g.setColor(Color.GRAY);
        g.setFont(Fonts.loadFont(Fonts.SPY, 30));
        g.drawString("Click anywhere to continue", 450, 600);
        if (toggle) {
            y = 240;
        } else {
            y = 220;
        }
        g.drawImage(Images.loadImage("title.png"), null, 270, y);
        toggle = !toggle;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        timer.stop();
        manager.setGameState(GameState.GAMEPLAY);
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
