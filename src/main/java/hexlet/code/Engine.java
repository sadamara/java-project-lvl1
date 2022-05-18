package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int BESTSCORE = 3;

    public static void runEngine(String question, String[][] questionAndAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(question);

        for (int i = 0; i < BESTSCORE; i++) {
            System.out.println("Question: " + questionAndAnswer[i][0]);
            String playerAnswer = scanner.nextLine();
            System.out.println("Your answer: " + playerAnswer);
            if (playerAnswer.equals(questionAndAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer. Correct answer was "
                        + "'" + questionAndAnswer[i][1] + "'" + ". Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
