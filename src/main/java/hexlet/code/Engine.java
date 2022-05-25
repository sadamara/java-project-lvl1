package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;

    public static void runEngine(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(description);

        for (String[] roundData : roundsData) {
            int question = 0;
            int answer = 1;
            System.out.println("Question: " + roundData[question]);
            System.out.println("Your answer: ");
            String playerAnswer = scanner.nextLine();
            if (!playerAnswer.equals(roundData[answer])) {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer. Correct answer was "
                        + "'" + roundData[answer] + "'" + ". Let's try again, " + playerName + "!");
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + playerName + "!");
        scanner.close();
    }
}
