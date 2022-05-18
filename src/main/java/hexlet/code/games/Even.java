package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String QUESTION = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int COUNTER = 1;
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 50;

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.BESTSCORE][2];
        for (int i = 0; i < Engine.BESTSCORE; i++) {
            int number = Utils.getRandomNumber(MINVALUE, MAXVALUE);
            questionAndAnswer[i][0] = String.valueOf(number);
            questionAndAnswer[i][COUNTER] = ((number % 2) == 0) ? "yes" : "no";
        }
        Engine.runEngine(QUESTION, questionAndAnswer);
    }
}
