package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "0 - Exit\n");
        Scanner chooseGame = new Scanner(System.in);
        switch (chooseGame.nextInt()) {
            case 0 :
                System.out.println("Goodbye!");
                break;
            case 1 :
                System.out.println("Welcome to the Brain Games!");
                System.out.println("May I have your name?");
                System.out.println("Hello, " + Cli.getName() + "!");
                break;
            case 2 :
                Even.isEven();
                break;
            default:
                System.out.println("Goodbye!");
                break;
        }

    }
}
