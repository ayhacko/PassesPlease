package Backend;

import java.awt.*;
import Frontend.PassesPlease;

public class GameManager {
    private PassesPlease game;
    private GameState state;
    private int day;
    private int savings;

    public GameManager(PassesPlease game) {
        this.game = game;
        state = GameState.TITLE;
        day = 1;
        savings = 20;
    }

    public void setGameState(GameState state) {
        this.state = state;
        game.changePanel(state);
        System.out.println("" + state);
    }

    public void playGame() {
        while (day < 8) {
            int people = 0;
            while (people <= 3) {
                people++;
                if (Math.random() > 0.75) {
                    new Teacher();
                } else {
                    new Student();
                }
            }
            day++;
        }
    }
}
