package hexlet.code;

import java.util.Scanner;

public class Even {
    private String usersAnswer;
    public static String getUsersAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void isEven() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = Cli.getName();
        System.out.println("Hello, " + name);
        var i = 0;
        final int bestScore = 3;
        final int maxRandomValue = 100;

        while (i < bestScore) {
            int number = (1 + (int) (Math.random() * maxRandomValue));
            System.out.println(number);
            String answer = getUsersAnswer();
            if (number % 2 == 0 && answer.equals("yes") || number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                i++;
            } else {
                if (number % 2 == 0) {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + name + "!");
                } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + name + "!");
                }
                break;
            }
        }
        if (i == bestScore) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
