package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 50;

    public static void runGame() {
        String[][] roundData = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            roundData[i] = generateRoundDataEven();
        }
        Engine.runEngine(DESCRIPTION, roundData);
    }

    private static boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public static String[] generateRoundDataEven() {
        String[] roundData = new String[2];
        int number = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        roundData[0] = String.valueOf(number);
        roundData[1] = (isEven(number) ? "yes" : "no");
        return roundData;
    }
}
