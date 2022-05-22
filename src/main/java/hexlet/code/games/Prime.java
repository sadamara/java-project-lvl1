package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int COUNTER = 1;
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 20;

    public static void runGame() {
        String[][] roundData = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int primeNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
            roundData[i][0] = String.valueOf(primeNumber);
            roundData[i][COUNTER] = (isPrime(primeNumber)) ? "yes" : "no";
        }

        Engine.runEngine(DESCRIPTION, roundData);
    }

    private static boolean isPrime(int primeNumber) {
        for (var e = 2; e < primeNumber; e++) {
            if (primeNumber % e == 0) {
                return false;
            }
        }
        return true;
    }
}
