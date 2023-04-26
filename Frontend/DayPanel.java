package Frontend;

import Backend.GameManager;

import javax.swing.*;

public class DayPanel extends JPanel {
    private GameManager manager;

    public DayPanel(GameManager manager) {
        this.manager = manager;
    }
}
