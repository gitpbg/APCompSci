package com.teach;

import java.util.Scanner;

/**
 * Created by gharpure on 3/3/17.
 */
public class Battleship {
    Board player;
    Board opponent;

    public Battleship() {
       player = new Board(10);
       opponent = new Board(10);
    }

    private boolean isGameFinished() {
        if (player.getActiveShips()==0)
            return true;
        if (opponent.getActiveShips()==0)
            return true;
        return false;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("I am running");
        player.draw();
//        opponent.draw();
        while(true) {
            System.out.println("Enter your move: ");
            String move = sc.next();
            if (move.equalsIgnoreCase("quit"))
                break;
            System.out.println("you played " + move);
            Position p = new Position(move);
            boolean didHit = opponent.processMove(p);
            opponent.draw();
            if (didHit)
               System.out.println("This move hit");
            if (opponent.getActiveShips()==0) {
                System.out.println("You win");
                opponent.draw();
                break;
            }

            Position q = opponent.getMove();
            didHit = player.processMove(q);
            if (didHit)
                System.out.println("You got hit");
            if (player.getActiveShips()==0) {
                System.out.println("You lost...");
            }
            player.draw();
        }
    }
}
