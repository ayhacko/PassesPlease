package Frontend;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Resources.Images.Images;
import Resources.Fonts.Fonts;

public class TitlePanel extends JPanel implements ActionListener {
    int y = 200;
    boolean toggle = false;

    Timer timer;

    public TitlePanel() {
        timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        repaint();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
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
}
