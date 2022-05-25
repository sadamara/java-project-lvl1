package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
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

    private static int calculateGCD(int firstNumber, int secondNumber) {
        int gcd = 0;
        while (secondNumber != 0) {
            int modulo = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = modulo;
            gcd = firstNumber;
        }
        return gcd;
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int firstNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
        int secondNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
        String description = firstNumber + " " + secondNumber;
        roundData[0] = description;
        int correctAnswer = calculateGCD(firstNumber, secondNumber);
        roundData[COUNTER] = String.valueOf(correctAnswer);
        return roundData;
    }
}
