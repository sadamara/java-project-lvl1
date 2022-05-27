package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_OF_PROGRESSION = 5;
    private static final int MAX_OF_PROGRESSION = 10;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 20;
    private static final int MIN_OF_STEP = 1;
    private static final int MAX_OF_STEP = 10;


    public static void runGame() {
        String[][] roundData = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            roundData[i] = generateRoundDataProgression();
        }
        Engine.runEngine(DESCRIPTION, roundData);
    }

    private static int[] generateProgression(int progressionLength, int firstElement, int step) {
        int[] newProgression = new int[progressionLength + 1];
        for (int j = 0; j <= progressionLength; j++) {
            firstElement += step;
            newProgression[j] = firstElement;
        }
        return newProgression;
    }

    private static String generateQuestion(int[] progression, int correctAnswer) {
        String question = "";
        for (var number : progression) {
            var numberToString = Integer.toString(number);
            question = String.join(" ", question, numberToString);
            if (number == progression[correctAnswer]) {
                question = String.join(".. ", question, numberToString).replaceAll(numberToString, "").trim();
            }
        }
        return question;
    }

    public static String[] generateRoundDataProgression() {
        String[] roundData = new String[2];
        int progressionLength = Utils.getRandomNumber(MIN_OF_PROGRESSION, MAX_OF_PROGRESSION);
        int[] progression = generateProgression(progressionLength,
                Utils.getRandomNumber(MIN_VALUE, MAX_VALUE),
                Utils.getRandomNumber(MIN_OF_STEP, MAX_OF_STEP));
        int correctAnswer = Utils.getRandomNumber(MIN_VALUE, progressionLength);
        roundData[0] = generateQuestion(progression, correctAnswer);
        roundData[1] = String.valueOf(progression[correctAnswer]);
        return roundData;
    }
}
