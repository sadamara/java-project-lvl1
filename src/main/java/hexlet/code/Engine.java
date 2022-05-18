package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void getGreet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static int getRandomNumber() {
        final var finish = 20;
        return (1 + (int) (Math.random() * finish));
    }

    public static int getRandomNumber10() {
        final var finish = 10;
        return (1 + (int) (Math.random() * finish));
    }

    public static String getUsersAnswerString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getUsersAnswerInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        final int max = 3;
        int i = (0 + (int) (Math.random() * max));
        return operators[i];
    }

    public static int getRandomLengthProgression() {
        final var start = 5;
        final var finish = 10;
        return (start + (int) (Math.random() * finish));
    }

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
