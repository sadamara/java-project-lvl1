package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 20;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void runGame() {
        String[][] roundData = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            roundData[i] = generateRoundDataCalc();
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
                throw new RuntimeException("Unexpected value" + " " + randomOperator);
        }
    }

    public static char getRandomOperator() {
        int i = Utils.getRandomNumber(0, (OPERATORS.length - 1));
        return OPERATORS[i];
    }

    public static String[] generateRoundDataCalc() {
        String[] roundData = new String[2];
        int firstNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        int secondNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        char randomOperator = getRandomOperator();
        String question = firstNumber + " " + randomOperator + " " + secondNumber;
        roundData[0] = question;
        roundData[1] = String.valueOf(
                    calculate(randomOperator, firstNumber, secondNumber));
        return roundData;
    }
}

