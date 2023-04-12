package Frontend;

import java.awt.*;
import javax.swing.*;
import Resources.Images.Images;

public class TitlePanel extends JPanel {
    @Override
    public void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.drawImage(Images.loadImage("title_screen.png"), null, 0, 0);
    }
}
