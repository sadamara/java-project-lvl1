package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int COUNTER = 1;
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 50;

    public static void runGame() {
        String[][] roundData = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            roundData[i] = generateRoundDataEven();
        }
        Engine.runEngine(DESCRIPTION, roundData);
    }

    private static boolean isEven(int evenNumber) {
        return (evenNumber % 2) == 0;
    }

    public static String[] generateRoundDataEven() {
        String[] roundData = new String[2];
        int number = Utils.getRandomNumber(MINVALUE, MAXVALUE);
        roundData[0] = String.valueOf(number);
        roundData[COUNTER] = (isEven(number) ? "yes" : "no");
        return roundData;
    }
}
