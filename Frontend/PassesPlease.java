package Frontend;

import Backend.*;

import javax.swing.*;
import java.awt.*;

public class PassesPlease {
    private GameManager manager;
    private static final int FRAME_WIDTH = 1280;
    private static final int FRAME_HEIGHT = 745;
    private final JFrame frame;
    private JPanel screens;
    private TitlePanel titlePanel;
    private TutorialPanel tutorialPanel;
    private GamePanel gamePanel;
    private EndPanel endPanel;

    public PassesPlease() {
        manager = new GameManager(this);

        titlePanel = new TitlePanel(manager);
        tutorialPanel = new TutorialPanel(manager);
        gamePanel = new GamePanel(manager);
        endPanel = new EndPanel(manager, this);

        frame = new JFrame("Passes, Please");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        screens = new JPanel(new CardLayout());
        screens.add(titlePanel, "TITLE");
        screens.add(tutorialPanel, "TUTORIAL");
        screens.add(gamePanel, "GAME");
        screens.add(endPanel, "END");

        frame.setContentPane(screens);

        frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void reset() {
        manager = new GameManager(this);

        screens.remove(titlePanel);
        screens.remove(tutorialPanel);
        screens.remove(gamePanel);
        screens.remove(endPanel);

        titlePanel = new TitlePanel(manager);
        tutorialPanel = new TutorialPanel(manager);
        gamePanel = new GamePanel(manager);
        endPanel = new EndPanel(manager, this);
        screens.add(titlePanel, "TITLE");
        screens.add(tutorialPanel, "TUTORIAL");
        screens.add(gamePanel, "GAME");
        screens.add(endPanel, "END");

        CardLayout layout = (CardLayout) screens.getLayout();
        layout.show(screens, "TITLE");
    }

    public void changePanel(GameState state) {
        CardLayout layout = (CardLayout) screens.getLayout();
        if (state == GameState.TITLE)
            layout.show(screens, "TITLE");
        else if (state == GameState.TUTORIAL)
            layout.show(screens, "TUTORIAL");
        else if (state == GameState.GAMEPLAY) {
            layout.show(screens, "GAME");
            gamePanel.startTimer();
        } else if (state == GameState.END)
            layout.show(screens, "END");
        else {
            reset();
        }
    }

    public GamePanel getGamePanel() {
        return gamePanel;
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
