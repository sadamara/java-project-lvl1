package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" + "5 - Progression\n" + "0 - Exit\n");
        Scanner chooseGame = new Scanner(System.in);
        switch (chooseGame.nextInt()) {
            case 1 :
                Engine.getGreet();
                String name = Cli.getName();
                System.out.println("Hello, " + name + "!");
                break;
            case 2 :
                Even.game();
                break;
            case 3 :
                Calc.game();
                break;
            case 4 :
                GCD.game();
                break;
            case 5 :
                Progression.game();
                break;
            default:
                System.out.println("Goodbye!");
                break;
        }

    }
}
