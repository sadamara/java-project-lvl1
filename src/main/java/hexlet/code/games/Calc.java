package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void runGame() {
        Engine.getGreet();
        String name = Engine.getName();
        System.out.println("What is the result of the expression?");
        var i = 0;
        final int bestScore = 3;

        while (i < bestScore) {
            int randomNumberOne = Engine.getRandomNumber();
            int randomNumberTwo = Engine.getRandomNumber();
            var plus = randomNumberOne + randomNumberTwo;
            var minus = randomNumberOne - randomNumberTwo;
            var multiply = randomNumberOne * randomNumberTwo;
            final var plusRandom = 1;
            final var minusRandom = 2;
            final var multiplyRandom = 3;

            if (Engine.getRandomOperator() == plusRandom) {
                System.out.println("Question: " + randomNumberOne + " + " + randomNumberTwo);
                int answer = Engine.getUsersAnswerInt();
                if (answer == plus) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was " + plus);
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (Engine.getRandomOperator() == minusRandom) {
                System.out.println("Question: " + randomNumberOne + " - " + randomNumberTwo);
                int answer2 = Engine.getUsersAnswerInt();
                if (answer2 == minus) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println(answer2 + " is wrong answer ;(. Correct answer was " + minus);
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (Engine.getRandomOperator() == multiplyRandom) {
                System.out.println("Question: " + randomNumberOne + " * " + randomNumberTwo);
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
