package Frontend;

import Backend.*;

import javax.swing.*;
import java.awt.*;

public class PassesPlease {
    private static final int FRAME_WIDTH = 1280;
    private static final int FRAME_HEIGHT = 720;

    private final JFrame frame;
    private final JPanel titlePanel = new TitlePanel();
    private final JPanel gamePanel = new GamePanel();
    private final JPanel dayPanel = new DayPanel();
    private final JPanel endPanel = new EndPanel();
    private final GameManager manager;
    public PassesPlease() {
        frame = new JFrame("Passes, Please");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(titlePanel);

        manager = new GameManager(this);

        frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void changePanel(GameState state) {
        if (state == GameState.TITLE)
            frame.setContentPane(titlePanel);
        else if (state == GameState.GAMEPLAY)
            frame.setContentPane(gamePanel);
        else if (state == GameState.ENDDAY)
            frame.setContentPane(dayPanel);
        else
            frame.setContentPane(endPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PassesPlease();
            }
        });
    }
}
