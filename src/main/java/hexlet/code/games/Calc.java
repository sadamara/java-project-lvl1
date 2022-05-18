package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static final int COUNTER = 1;
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 20;

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.BESTSCORE][2];
        for (int i = 0; i < Engine.BESTSCORE; i++) {
            int firstNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
            int secondNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
            String randomOperator = Utils.getRandomOperator();
            String question = firstNumber + " " + randomOperator + " " + secondNumber;
            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][COUNTER] = String.valueOf(
                    getTrueAnswer(randomOperator, firstNumber, secondNumber));
        }
        Engine.runEngine(QUESTION, questionAndAnswer);
    }

    private static int getTrueAnswer(String randomOperator, int firstNumber, int secondNumber) {
        int answer = 0;
        switch (randomOperator) {
            case "+":
                answer = firstNumber + secondNumber;
                break;
            case "-" :
                answer = firstNumber - secondNumber;
                break;
            case "*":
                answer = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Unexpected value");
                break;
        }
        return answer;
    }
}
