package com.teach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
	    System.out.println("Lets Play Rock Paper Scissors...");
	    Scanner s = new Scanner(System.in);
	    String input = "";
	    do {
            System.out.println("Enter R, P or S to indicate Rock, Paper or Scissors. Q to Quit");
            input = s.next();
            String computersChoice = rps.getChoice();
            // sanitize the input here
            // if the user typed R or r convert it to Rock
            // if the user typed P ....
            // if the user did not enter a correct value, let them know and ask again
            // take the appropriate action if the user entered Q or q
            //
            boolean cmpWin = rps.doesComputerWin(computersChoice, input);
            System.out.println("I chose " + computersChoice + " you chose " + input);
            if (cmpWin) {
                System.out.println("Woohoo, I win...");
            } else {
                System.out.println("Dang, I lost to you!!!");
            }
        } while(!input.equalsIgnoreCase("q"));
    }
}
