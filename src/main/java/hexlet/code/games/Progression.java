package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static void runGame() {
        Engine.getGreet();
        String name = Engine.getName();
        System.out.println("What number is missing in the progression?");
        var i = 0;
        final int bestScore = 3;

        while (i < bestScore) {
            int[] progression = new int[Engine.getRandomLengthProgression()];
            var length = progression.length - 1;
            var number = Engine.getRandomNumber();
            var n = Engine.getRandomNumber10();
            for (var e = 0; progression.length >  e; e++) {
                progression[e] = number;
                number += n;
            }
            var hole = (1 + (int) (Math.random() * length));
            var answer  = progression[hole];
            final var replace = 1111;
            progression[hole] = replace;
            String question = Arrays.toString(progression);
            question = question.replace("1111", "..");
            question = question.replace(",", "");
            question = question.replace("[", "");
            question = question.replace("]", "");
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            int userAnswer = Engine.getUsersAnswerInt();
            if (answer == userAnswer) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + answer);
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (i == bestScore) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}

