package Backend;

public class GameManager {
    private GameState state;
    private int day;
    private int savings;

    public GameManager() {
        state = GameState.TITLE;
        day = 1;
        savings = 20;
    }

    public void setGameState(GameState state) {
        this.state = state;
    }
}
