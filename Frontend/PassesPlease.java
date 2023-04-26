package Frontend;

import Backend.*;

import javax.swing.*;
import java.awt.*;

public class PassesPlease {
    private final GameManager manager;

    private static final int FRAME_WIDTH = 1280;
    private static final int FRAME_HEIGHT = 745;

    private final JFrame frame;
    private final JPanel screens;
    private final TitlePanel titlePanel;
    private final GamePanel gamePanel;
    private final DayPanel dayPanel;
    private final EndPanel endPanel;

    public PassesPlease() {
        manager = new GameManager(this);

        titlePanel = new TitlePanel(manager);
        gamePanel = new GamePanel(manager);
        dayPanel = new DayPanel(manager);
        endPanel = new EndPanel(manager);

        frame = new JFrame("Passes, Please");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        screens = new JPanel(new CardLayout());
        screens.add(titlePanel, "TITLE");
        screens.add(gamePanel, "GAME");
        screens.add(dayPanel, "DAY");
        screens.add(endPanel, "END");

        frame.setContentPane(screens);

        frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        //frame.set
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void changePanel(GameState state) {
        CardLayout layout = (CardLayout) screens.getLayout();
        if (state == GameState.TITLE)
            layout.show(screens, "TITLE");
        else if (state == GameState.GAMEPLAY)
            layout.show(screens, "GAME");
        else if (state == GameState.ENDDAY)
            layout.show(screens, "DAY");
        else
            layout.show(screens, "END");
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
