package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void getGreet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
    }

    public static int getRandomNumber() {
        var finish = 30;
        return (1 + (int) (Math.random() * finish));
    }

    public static int getRandomNumber10() {
        var finish = 10;
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

    public static int getRandomOperator() {
        var finish = 3;
        return (1 + (int) (Math.random() * finish));
    }

    public static int getRandomLengthProgression() {
        var start = 5;
        var finish = 10;
        return (start + (int) (Math.random() * finish));
    }
}
