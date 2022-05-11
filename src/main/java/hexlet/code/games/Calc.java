package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {
    public static void game() {
        Engine.getGreet();
        String name = Cli.getName();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");
        var i = 0;
        final int bestScore = 3;

        while (i < bestScore) {
            int randomNumberOne = Engine.getRandomNumber();
            int randomNumberTwo = Engine.getRandomNumber();
            var plus = randomNumberOne + randomNumberTwo;
            var minus = randomNumberOne - randomNumberTwo;
            var multiply = randomNumberOne * randomNumberTwo;

            if (Engine.getRandomOperator() == 1) {
                System.out.println("Question: " + randomNumberOne + "+" + randomNumberTwo);
                int answer = Engine.getUsersAnswerInt();
                if (answer == plus) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was " + plus);
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (Engine.getRandomOperator() == 2) {
                System.out.println("Question: " + randomNumberOne + "-" + randomNumberTwo);
                int answer2 = Engine.getUsersAnswerInt();
                if (answer2 == minus) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println(answer2 + " is wrong answer ;(. Correct answer was " + minus);
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (Engine.getRandomOperator() == 3) {
                System.out.println("Question: " + randomNumberOne + "*" + randomNumberTwo);
                int answer3 = Engine.getUsersAnswerInt();
                if (answer3 == multiply) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println(answer3 + " is wrong answer ;(. Correct answer was " + multiply);
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
        }
        if (i == bestScore) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
