package Backend;

import java.awt.*;
import java.awt.event.*;

import Frontend.PassesPlease;

public class GameManager {
    public static final String DATE = "9/6/89";
    private PassesPlease game;
    private GameState state;
    private int score;
    private int timeLeft;
    private Person person;
    private int stamped;

    public GameManager(PassesPlease game) {
        this.game = game;
        state = GameState.TITLE;
        score = 0;
        timeLeft = 300;
    }


    public void actionPerformed(ActionEvent e) {

    }

    public void setGameState(GameState state) {
        this.state = state;
        game.changePanel(state);
        System.out.println("" + state);
    }

    public void playGame() {
        while (timeLeft > 0) {
            int people = 0;
            while (people <= 3) {
                people++;
                if (Math.random() > 0.85) {
                    new Teacher();
                } else {
                    new Student();
                }
            }
            day++;
        }
    }

    public void nextPerson() {
        if (Math.random() > 0.85) {
            person = new Teacher();
        } else {
            person = new Student();
        }
    }

    public boolean validDocuments() {
        if (person instanceof Student) {

        } else if (person instanceof Teacher) {

        }
    }

    public boolean correctEntry() {

    }

    public int getTime() {
        return timeLeft;
    }

    public void decreaseTime() {
        timeLeft--;
    }

    public void timePenalty() {
        timeLeft -= 15;
        if (timeLeft < 0)
            timeLeft = 0;
    }

}
