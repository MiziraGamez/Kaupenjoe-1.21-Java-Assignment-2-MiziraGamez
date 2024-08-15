package net.miziragamez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* ASSIGNMENT TWO */
        // MY ATTEMPT

        Scanner scanner = new Scanner(System.in);

        String[] triviaQuestions = new String[5];
        triviaQuestions[0] = "How many different elemental types are in Pokemon? Answer with an integer.";
        triviaQuestions[1] = "How many playable characters are there in Super Smash Bros Ultimate (including Echo Fighters)? Answer with an integer.";
        triviaQuestions[2] = "In Chainsaw Man, Power is a Fiend Devil representing what concept?";
        triviaQuestions[3] = "Kingdom Key has an Ability attached to it in Kingdom Hearts II Final Mix. What is that Ability?";
        triviaQuestions[4] = "What is the material required to duplicate all Smithing Templates in Minecraft?";

        String[] triviaAnswers = new String[5];
        triviaAnswers[0] = "18";
        triviaAnswers[1] = "89";
        triviaAnswers[2] = "Blood";
        triviaAnswers[3] = "Damage_Control";
        triviaAnswers[4] = "Diamond";

        int score = 0;

        while (true) {
            for (int q = 0; q < triviaQuestions.length; q++) {
                printQuestions(triviaQuestions[q]);
                String inputAnswer = scanner.next();

                if(isCorrect(inputAnswer, triviaAnswers[q])) {
                    System.out.println("That is correct!");
                    score = increaseScore(score);

                } else {
                    System.out.println("Oh dear, that was incorrect!");
                    getCorrectAnswer(triviaAnswers[q]);
                }
            }
            System.out.println("You got " + score + " out of 5 correct!");
            System.out.println("Would you like to try again? Yes or No");
            if (scanner.next().equals("Yes")) {
                score = 0;
                continue;
            } else {
                break;
            }
        }
        printEndingMessages();
    }


    public static void printQuestions(String triviaQuestions){
        System.out.println(triviaQuestions);
    }
    public static void getCorrectAnswer(String correctAnswer) {
        System.out.println("The correct answer was: " + correctAnswer);
    }
    public static boolean isCorrect(String inputAnswer, String correctAnswer) {
        return inputAnswer.equals(correctAnswer);
    }
    public static int increaseScore(int score) {
        return score + 1;
    }
    public static void printEndingMessages() {
        System.out.println("Thank you for playing!");
        System.out.println("Talk to you lovelies later!");
    }
}