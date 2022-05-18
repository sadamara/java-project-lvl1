package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Progression {

    private static final String QUESTION = "What number is missing in the progression?";
    private static final int COUNTER = 1;
    private static final int MINOFPROGRESSION = 5;
    private static final int MAXOFPROGRESSION = 10;
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 20;
    private static final int MINOFSTEP = 1;
    private static final int MAXOFSTEP = 11;


    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.BESTSCORE][2];
        for (int i = 0; i < Engine.BESTSCORE; i++) {
            int lengthProgression = Utils.getRandomNumber(MINOFPROGRESSION, MAXOFPROGRESSION);
            String[] progression = setProgression(lengthProgression,
                    Utils.getRandomNumber(MINVALUE, MAXVALUE),
                    Utils.getRandomNumber(MINOFSTEP, MAXOFSTEP));
            Random random = new Random();
            int correctAnswer = random.nextInt(progression.length);
            questionAndAnswer[i][0] = generateQuestion(progression, correctAnswer);
            questionAndAnswer[i][COUNTER] = String.valueOf(progression[correctAnswer]);
        }
        Engine.runEngine(QUESTION, questionAndAnswer);
    }

    private static String[] setProgression(int lengthProgression, int firstElement, int step) {
        String[] sum = new String[lengthProgression + 1];
        for (int j = 0; j <= lengthProgression; j++) {
            firstElement += step;
            sum[j] = String.valueOf(firstElement);
        }
        return sum;
    }

    private static String generateQuestion(String[] progression, int correctAnswer) {
        String question = "";
        for (String number : progression) {
            question = String.join(" ", question, number);
            if (number.equals(progression[correctAnswer])) {
                question = String.join(".. ", question, number).replaceAll(number, "").trim();
            }
        }
        return question;
    }
}
