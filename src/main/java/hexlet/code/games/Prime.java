package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    public static void game() {
        Engine.getGreet();
        String name = Cli.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var i = 0;
        final int bestScore = 3;

        while (i < bestScore) {
            int number = Engine.getRandomNumber();
            System.out.println("Question: " + number);
            String answer = "yes";
            for (var e = 2; e < number; e++) {
                if (number % e == 0) {
                    answer = answer.replace("yes", "no");
                }
            }
            System.out.println("Your answer: ");
            String userAnswer = Engine.getUsersAnswerString();
            if (answer.equals(userAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + answer + "'" + ".");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (i == bestScore) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
