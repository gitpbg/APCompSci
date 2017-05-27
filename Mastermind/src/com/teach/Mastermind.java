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
            System.out.print("Play a new game of Mastermind ? ");
            String answer = scanner.next().trim();
            if (answer.equals("Y")) {
                boolean done = false;
                String code = makeCode(4);
                while(!done) {
                    String guess = getGuess(tries, scanner);
                    if (guess.equals(code)) {
                        System.out.println("Great Job: Code was " + code);
                        done = true;
                        break;
                    }
                    String result = evaluateGuess(code, guess);
                    System.out.println("Clue: " + result);
                    tries++;
                    if (tries > 20) {
                        System.out.println("Too many tries");
                    }
                }
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
        String rv = "";
        boolean used[] = new boolean[code.length()];
        for (int i = 0; i < code.length(); i++) {
            used[i] = false;
        }
        for (int i=0;i<code.length();i++) {
            if (code.charAt(i) == guess.charAt(i)) {
                rv += "W";
                used[i] = true;
            }
        }
        for (int i=0;i<code.length();i++) {
            if (code.charAt(i)!=guess.charAt(i)) {
                int pos = guess.indexOf(code.charAt(i));
                if (pos >= 0 && used[pos]==false) {
                    rv+="B";
                    used[pos] = true;
                }
            }
        }
        while(rv.length() < code.length()) {
            rv += "-";
        }
        return rv;
    }

    private String getGuess(int tries, Scanner scanner) {
        //ask the player for their guess print the # of tries before the question
        //clean up the input and return the result
        System.out.print("Try # " + tries + " Enter Your Guess ");
        boolean entryisBad = true;
        String rv = "";
        while(entryisBad) {
            rv = scanner.next();
            rv = rv.trim();
            if (rv.length() < 4) {
                System.out.println("Guess is too short");
                continue;
            }
            if (rv.length() > 4) {
                System.out.println("Guess is too long");
                continue;
            }
            int good = 0;
            for (int i = 0; i < 4; i++) {
                if ("0123456789".indexOf(rv.charAt(i)) >= 0) {
                    good++;
                }
            }
            if (good != 4) {
                System.out.println("Guess has illegal entries");
                continue;
            }
            entryisBad = false;
        }
        return rv;
    }

    private String makeCode(int codeLength) {
        //randomly build a code that is codeLength characters long out of numbers 0-9
        //return a string containing the code.
        String nums = "0123456789";
        int len = nums.length();
        String rv = "";
        for (int i = 0; i < 4; i++) {
            int pos = (int)(Math.random() * len);
            rv += nums.charAt(pos);
        }
        System.out.println(rv);
        return rv;
    }
}
