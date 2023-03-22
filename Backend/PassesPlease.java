package Backend;

import javax.swing.*;

public class PassesPlease {
    private final JFrame frame;

    private final GameManager manager;
    public PassesPlease() {
        frame = new JFrame("Passes, Please");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        manager = new GameManager();
    }

    
}
