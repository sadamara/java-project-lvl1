package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void runEngine(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(description);

        for (int i = 0; i < ROUND_COUNT; i++) {
            System.out.println("Question: " + roundsData[i][QUESTION]);
            String playerAnswer = scanner.nextLine();
            System.out.println("Your answer: " + playerAnswer);
            if (!playerAnswer.equals(roundsData[i][ANSWER])) {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer. Correct answer was "
                        + "'" + roundsData[i][ANSWER] + "'" + ". Let's try again, " + playerName + "!");
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + playerName + "!");
        scanner.close();
    }
}
