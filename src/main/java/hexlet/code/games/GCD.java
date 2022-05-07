package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {
    public static void game() {
        Engine.getGreet();
        String name = Cli.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        var i = 0;
        final int bestScore = 3;

        while (i < bestScore) {
            int randomNumberOne = Engine.getRandomNumber();
            int randomNumberTwo = Engine.getRandomNumber();
            System.out.println("Question: " + randomNumberOne + " " + randomNumberTwo);
            while (randomNumberOne != 0 && randomNumberTwo != 0) {
                if (randomNumberOne > randomNumberTwo) {
                    randomNumberOne = randomNumberOne % randomNumberTwo;
                } else {
                    randomNumberTwo = randomNumberTwo % randomNumberOne;
                }
            }
            int trueAnswer = randomNumberOne + randomNumberTwo;
            System.out.println("Your answer: ");
            int userAnswer = Engine.getUsersAnswerInt();
            if (trueAnswer == userAnswer) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + trueAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (i == bestScore) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
