package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static void getGreet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
    }

    public static int getRandomNumber() {
        return (1 + (int) (Math.random() * 30));
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
        return (1 + (int) (Math.random() * 3));
    }

}
