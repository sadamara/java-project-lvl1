package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 20;

    public static void runGame() {
        String[][] roundData = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            roundData[i] = generateRoundDataGCD();
        }
        Engine.runEngine(DESCRIPTION, roundData);
    }

    private static int calculateGCD(int firstNumber, int secondNumber) {
        int gcd = 0;
        int mirrorFirstNumber = firstNumber;
        int mirrorSeondNumber = secondNumber;
        while (mirrorSeondNumber != 0) {
            int modulo = mirrorFirstNumber % mirrorSeondNumber;
            mirrorFirstNumber = mirrorSeondNumber;
            mirrorSeondNumber = modulo;
            gcd = mirrorFirstNumber;
        }
        return gcd;
    }

    public static String[] generateRoundDataGCD() {
        String[] roundData = new String[2];
        int firstNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        int secondNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        String question = firstNumber + " " + secondNumber;
        roundData[0] = question;
        int correctAnswer = calculateGCD(firstNumber, secondNumber);
        roundData[1] = String.valueOf(correctAnswer);
        return roundData;
    }
}
