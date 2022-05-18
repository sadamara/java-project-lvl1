package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    private static final int COUNTER = 1;
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 20;

    public static void runGame() {

        String[][] questionAndAnswer = new String[Engine.BESTSCORE][2];
        for (int i = 0; i < Engine.BESTSCORE; i++) {
            int firstNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
            int secondNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
            String question = firstNumber + " " + secondNumber;
            questionAndAnswer[i][0] = question;
            int correctAnswer = isGCD(firstNumber, secondNumber);
            questionAndAnswer[i][COUNTER] = String.valueOf(correctAnswer);
        }
        Engine.runEngine(QUESTION, questionAndAnswer);
    }

    private static int isGCD(int firstNumber, int secondNumber) {
        int trueAnswer = 0;
        while (secondNumber != 0) {
            int modulo = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = modulo;
            trueAnswer = firstNumber;
        }
        return trueAnswer;
    }
}
