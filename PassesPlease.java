import Backend.*;
import Frontend.*;
import Resources.*;
import Resources.Images.*;

import javax.swing.*;

public class PassesPlease {
    private final JFrame frame;
    private final JPanel titlePanel = new TitlePanel();
    private final JPanel gamePanel = new GamePanel();
    private final JPanel dayPanel = new DayPanel();
    private final JPanel endPanel = new EndPanel();
    private final GameManager manager;
    public PassesPlease() {
        frame = new JFrame("Passes, Please");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        manager = new GameManager();
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
