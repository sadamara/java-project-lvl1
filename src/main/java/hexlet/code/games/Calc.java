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
            roundData[i] = generateRoundData();
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
        char[] operators = {'+', '-', '*'};
         int min = 0;
         int max = 2;
        int i = Utils.getRandomNumber(min, max);
        return operators[i];
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int firstNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
        int secondNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
        char randomOperator = getRandomOperator();
        String description = firstNumber + " " + randomOperator + " " + secondNumber;
        roundData[0] = description;
        roundData[COUNTER] = String.valueOf(
                    calculate(randomOperator, firstNumber, secondNumber));
        return roundData;
    }
}

