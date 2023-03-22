package Backend;

public class GameManager {
    private GameState state;
    private int day;
    private int savings;
    public enum GameState {
        INITIAL,
        GAMEPLAY,
        ENDDAY
    }

    public GameManager() {
        state = GameState.INITIAL;
        day = 1;
        savings = 20;
    }

    public void setGameState(GameState state) {
        this.state = state;
    }
}
