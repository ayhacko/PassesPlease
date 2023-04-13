package Backend;

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
    }
}
