package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static final int COUNTER = 1;

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.BESTSCORE][2];
        for (int i = 0; i < Engine.BESTSCORE; i++) {
            int firstNumber = Engine.getRandomNumber();
            int secondNumber = Engine.getRandomNumber();
            String randomOperator = Engine.getRandomOperator();
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
