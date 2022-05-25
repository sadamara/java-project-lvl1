package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int COUNTER = 1;
    private static final int MINOFPROGRESSION = 5;
    private static final int MAXOFPROGRESSION = 10;
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 20;
    private static final int MINOFSTEP = 1;
    private static final int MAXOFSTEP = 10;


    public static void runGame() {
        String[][] roundData = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            roundData[i] = generateRoundData();
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

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int progressionLength = Utils.getRandomNumber(MINOFPROGRESSION, MAXOFPROGRESSION);
        int[] progression = generateProgression(progressionLength,
                Utils.getRandomNumber(MINVALUE, MAXVALUE),
                Utils.getRandomNumber(MINOFSTEP, MAXOFSTEP));
        int correctAnswer = Utils.getRandomNumber(MINVALUE, progressionLength);
        roundData[0] = generateQuestion(progression, correctAnswer);
        roundData[COUNTER] = String.valueOf(progression[correctAnswer]);
        return roundData;
    }
}
