package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int COUNTER = 1;
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 20;

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.BESTSCORE][2];
        for (int i = 0; i < Engine.BESTSCORE; i++) {
            Integer primeNumber = Utils.getRandomNumber(MINVALUE, MAXVALUE);
            questionAndAnswer[i][0] = String.valueOf(primeNumber);
            questionAndAnswer[i][COUNTER] = (isProbablePrime(primeNumber)) ? "yes" : "no";
        }

        Engine.runEngine(DESCRIPTION, questionAndAnswer);
    }

    private static boolean isProbablePrime(Integer primeNumber) {
        String answer = "yes";
        for (var e = 2; e < primeNumber; e++) {
            if (primeNumber % e == 0) {
                answer = answer.replace("yes", "no");
            }
        }
        return answer.equals("yes");
    }
}
