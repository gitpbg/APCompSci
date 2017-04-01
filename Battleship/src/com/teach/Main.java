package com.teach;

public class Main {

    public static void main(String[] args) {
	    System.out.println("**********************************");
	    System.out.println("*       W E L C O M E            *");
	    System.out.println("*            T O                 *");
	    System.out.println("*      A P C O M P S C I         *");
        System.out.println("*     B A T T L E S H I P        *");
	    System.out.println("**********************************");
//	    Position p = new Position(4,5);
//	    Position q = new Position("G10");
//	    System.out.println("Row = " + q.getRow() + " Column = " + q.getColumn());
//	    System.out.println(p.toString());
	    Battleship game = new Battleship();
	    game.run();
    }
}
