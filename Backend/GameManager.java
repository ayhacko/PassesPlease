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
    private String discrepancy;

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
        discrepancy = "";
    }

    public void setGameState(GameState state) {
        this.state = state;
        game.changePanel(state);
    }

    public Person getPerson() {
        return person;
    }

    public int getScore() {
        return score;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    public void nextPerson() {
        if (decision == person.letThrough()) {
            score += 1;
            timeLeft += 5;
            discrepancy = "";
        } else {
            discrepancy = "CITATION: " + person.getReason();
            score -= 1;
            timeLeft -= 15;
            if (timeLeft < 0) {
                game.getGamePanel().stopTimer();
                setGameState(GameState.END);
            }
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
        if (timeLeft < 0) {
            game.getGamePanel().stopTimer();
            setGameState(GameState.END);
        }
    }

    public String getDiscrepancy() {
        return discrepancy;
    }
}
