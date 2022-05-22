package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int COUNTER = 1;
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 20;

    public static void runGame() {
        String[][] roundData = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int firstNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
            int secondNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
            char randomOperator = getRandomOperator();
            String description = firstNumber + " " + randomOperator + " " + secondNumber;
            roundData[i][0] = description;
            roundData[i][COUNTER] = String.valueOf(
                    calculate(randomOperator, firstNumber, secondNumber));
        }
        Engine.runEngine(DESCRIPTION, roundData);
    }

    private static int calculate(char randomOperator, int firstNumber, int secondNumber) {

        switch (randomOperator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            default:
                throw new RuntimeException("Unexpected value");
        }
    }

    public static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        final int max = 3;
        int i = ((int) (Math.random() * max));
        return operators[i];
    }
}

