package com.teach;

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

    public void run() {
        System.out.println("I am running");
        player.draw();
    }
}
