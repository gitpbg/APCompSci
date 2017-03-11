package com.teach;

import org.omg.PortableInterceptor.HOLDING;

/**
 * Created by gharpure on 3/3/17.
 */
public class Ship {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    int size;
    char image;
    int hits;
    int row;
    int column;
    int orientation;

    public Ship(int pSize, char pImage, int row, int col, int orientation) {
        this.size = pSize;
        this.image = pImage;
        this.row = row;
        this.column = col;
        this.orientation = orientation;
        this.hits = 0;
    }


    void hasBeenHit() {
        if (hits < size)
            hits++;
    }

    int getSize() { return size;}
    int getRow() {return row;}
    int getColumn() {return column;}
    int getOrientation() {return orientation;}

    boolean isPointInside(int r, int c) {
        if (orientation==HORIZONTAL) {
            if ((row == r) && (c >= column) && (c <= column + size))
                return true;
        }
        else {
            if ((column==c) && (r >= row) && (r <= row + size))
                return true;
        }
        return false;
    }
    void setOrientation(int o) {
        orientation = o;
    }
    void setPosition(int r, int c) {
        this.row = r;
        this.column = c;
    }

    boolean isHorizontal() {return orientation==HORIZONTAL; }
    boolean isVertical() {return !isHorizontal();}

    char getImage() {return image;}
    boolean isSunk() { return (hits==size); }
    public String toString() {
        return String.format("(%d, %d) O: %d T: %c", row, column, orientation, image);
    }
}
