package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        Scanner chooseGame = new Scanner(System.in);
        final var greet = 1;
        final var even = 2;
        final var calc = 3;
        final var gcd = 4;
        final var progression = 5;
        final var prime = 6;
        switch (chooseGame.nextInt()) {
            case greet:
                Engine.getGreet();
                String name = Cli.getName();
                System.out.println("Hello, " + name + "!");
                break;
            case even:
                Even.game();
                break;
            case calc:
                Calc.game();
                break;
            case gcd:
                GCD.game();
                break;
            case progression:
                Progression.game();
                break;
            case prime:
                Prime.game();
                break;
            default:
                System.out.println("Goodbye!");
        }

    }
}
