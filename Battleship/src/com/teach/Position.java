package com.teach;

/**
 * Created by gharpure on 3/17/17.
 */
public class Position {
    int row;
    int column;

    Position(int r, int c) {
        row = r;
        column = c;
    }

    //Convert <letter><number> into row and column
    Position(String s) {
        char rowChar = s.charAt(0);
        String colChars = s.substring(1);
        row = (int)(rowChar - 'A');
        column = Integer.parseInt(colChars) - 1;
    }

    int getRow() {return row;}
    int getColumn() {return column;}

    // should return the row and column converted to <Letter><number>
    public String toString() {
        char rowChar = (char)('A' + row);
        String colChars = Integer.toString(column+1);
        return "" + rowChar + colChars;
    }
}
