package Resources;

import java.util.ArrayList;

public class DialogueFactory {
    private String[] phrase1 = {
            "Well, hello there.",
            "What's up.",
            "Please just let me through.",
            "Do I really need to give you my documents?",
            "Hellllllloooooooooo!",
            "Can we like not do this?",
            "Would you kindly let me through?",
            "There is no need to check my documents!",
            "HI :)",
            "Hi there."
    };
    private String[] phrase2 = {
            "Fine, here's my document.",
            "I can promise you that there is nothing wrong with my documents.",
            "Here are my documents.",
            "Can you hurry up with it.",
            "What a bother.",
            "Ugh, fine. Take them!",
            "Get on with it!",
            "Why do you have to be so responsible!",
            "Fine!",
            "Whatever, take them."

    };

    public String generatePhrase1(){
        String phrase = "";
        int num = 0;

        num = (int) (Math.random()*9);
        phrase = phrase1[num];

        return phrase;
    }

    public String generatePlayerResponse(){
        return "Give me your documents.";
    }

    public String generatePhrase2(){
        String phrase = "";
        int num = 0;

        num = (int) (Math.random()*9);
        phrase = phrase2[num];

        return phrase;
    }


}
