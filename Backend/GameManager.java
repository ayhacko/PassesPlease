package Backend;

import java.awt.*;
import java.awt.event.*;

import Frontend.*;

public class GameManager {
    public static final String DATE = "9/6/89";
    private PassesPlease game;
    private GameState state;
    private int score;
    private int timeLeft;
    private Person person;
    private boolean decision;

    public GameManager(PassesPlease game) {
        this.game = game;
        state = GameState.TITLE;
        score = 0;
        timeLeft = 300;
        if (Math.random() > 0.85) {
            person = new Teacher();
        } else {
            person = new Student();
        }
    }

    public void setGameState(GameState state) {
        this.state = state;
        game.changePanel(state);
    }

    public Person getPerson() {
        return person;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    public void nextPerson() {
        if (!decision && !person.letThrough()) {
            score += 5;
            timeLeft += 5;
        } else if (decision && person.letThrough()) {
            score += 1;
        } else {
            timeLeft -= 15;
        }
        if (Math.random() > 0.85) {
            person = new Teacher();
        } else {
            person = new Student();
        }
        game.getGamePanel().setUIPerson(person);
    }

    public int getTime() {
        return timeLeft;
    }

    public void decreaseTime() {
        timeLeft--;
    }
}
