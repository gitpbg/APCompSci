package com.teach;

import java.util.Scanner;

/**
 * Created by gharpure on 5/26/17.
 */
public class Mastermind {

    public void run() {
        boolean canQuit = false;
        Scanner scanner = new Scanner(System.in);
        while(!canQuit) {
            int  tries = 0;
            String code = makeCode(4);
            System.out.print("Play a new game of Mastermind ? ");
            String answer = scanner.next().trim();
            if (answer.equals("Y")) {
                String guess = getGuess(tries, scanner);
                if (guess.equals(code)) {
                    System.out.println("Great Job: Code was " + code);
                }
                String result = evaluateGuess(code, guess);
                System.out.println("Clue: " + result);
            } else {
                canQuit = true;
            }
        }
        System.out.println("Good Bye");
    }

    private String evaluateGuess(String code, String guess) {
        //Match the guess vs the code
        //if the letter in the guess is in the code and in the correct place that is a 'W"
        //if the letter in the guess is in the code and in the wrong place that is a "B"
        //if the letter does not exist then return a '-'
        //do not match the same letter in the code more than once
        //return the final evalulation.
    }

    private String getGuess(int tries, Scanner scanner) {
        //ask the player for their guess print the # of tries before the question
        //clean up the input and return the result
    }

    private String makeCode(int codeLength) {
        //randomly build a code that is codeLength characters long out of numbers 0-9
        //return a string containing the code.

    }
}
