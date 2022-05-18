package hexlet.code.games;

import hexlet.code.Engine;


public class Even {
    public static void runGame() {
        Engine.getGreet();
        String name = Engine.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var i = 0;
        final int bestScore = 3;

        while (i < bestScore) {
            int number = Engine.getRandomNumber();
            System.out.println("Question: " + number);
            System.out.println("Your answer:");
            String answer = Engine.getUsersAnswerString();
            if (number % 2 == 0 && answer.equals("yes") || number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                i++;
            } else {
                if (number % 2 == 0) {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + name + "!");
                } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + name + "!");
                }
                break;
            }
        }
        if (i == bestScore) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
