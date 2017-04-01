package com.teach;


/**
 * Created by gharpure on 3/3/17.
 */
public class Board {
    public final int MAX_SHIPS = 5;
    public final char SEA_CHAR = '.';
    public final char BOMB_CHAR = 'X';

    char theBoard[][];
    Ship theShips[] = new Ship[MAX_SHIPS];

    public Board(int dimensions) {
        theBoard = new char[dimensions][dimensions];
        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                theBoard[i][j] = SEA_CHAR;
            }
        }
        theShips[0] = new Ship(5, 'B', 0, 0, Ship.HORIZONTAL);
        theShips[1] = new Ship(4, 's', 0, 0, Ship.HORIZONTAL);
        theShips[2] = new Ship(4, 'C', 0, 0, Ship.HORIZONTAL);
        theShips[3] = new Ship(2, 'b', 0, 0, Ship.HORIZONTAL);
        theShips[4] = new Ship(2, 'b', 0, 0, Ship.HORIZONTAL);

        placeShips();
    }

    private void placeShip(Ship s) {
        for (int i = 0; i < s.getSize(); i++) {
            if (s.isHorizontal()) {
                theBoard[s.getRow()][s.getColumn()+i] = s.getImage();
            } else if (s.isVertical()) {
                theBoard[s.getRow()+i][s.getColumn()] = s.getImage();
            }
        }
    }

    /**
     * returns a number x where min <= x < max
     *
     * @param min
     * @param max
     * @return
     */
    private int getRandom(int min, int max) {
        double v = (double) min + Math.random() * (double) (max - min);
        return (int)Math.floor(v);
    }

    private boolean checkCollision(int theShip, int row, int col, int ori) {
        Ship s = theShips[theShip];
//        System.out.println("Checking Collision for " + s + "#" + theShip);
        for (int j = 0; j < theShip; j++) {
            Ship prev = theShips[j];
//            System.out.println("vs " + prev + " #" + j);
            for (int k = 0; k < s.getSize(); k++) {
                int c = (ori==Ship.HORIZONTAL) ? col + k : col;
                int r = (ori== Ship.VERTICAL) ? row + k : row;
//                System.out.print(r + ", " + c + " ");
                boolean intersect = prev.isPointInside(r, c);
//                System.out.println(intersect);
                if (intersect)
                    return intersect;
            }
        }
        return false;
    }
    private void placeShips() {
        for (int i = 0; i < theShips.length; i++) {
            Ship s = theShips[i];
            boolean collision = false;
            do {
                int ori = getRandom(0, 2);
                int row = getRandom(0, (ori == Ship.VERTICAL ? theBoard.length - s.getSize() : theBoard.length));
                int col = getRandom(0, (ori == Ship.HORIZONTAL) ? theBoard[0].length - s.getSize() : theBoard[0].length);
                collision = checkCollision(i, row, col, ori);
                if (collision==false) {
                    s.setPosition(row, col);
                    s.setOrientation(ori);
                    placeShip(s);
//                    draw();
                    break;
                }
            } while(true);
        }
    }
    private void drawColumnNames() {
        System.out.print("   ");
        for (int i = 0; i < theBoard.length; i++) {
            System.out.print(String.format("  %2d", i+1));
        }
        System.out.println("");
    }
    private void drawHorizLine() {
        System.out.print("   ");
        for (int i = 0; i < theBoard.length + 1; i ++) {
            System.out.print("----");
        }
        System.out.println("");
    }

    void drawRow(char row[], int rownum) {
        System.out.print(String.format("%3c", 'A' + rownum));
        for (int i = 0; i < row.length; i++) {
            System.out.print("| " + row[i] + " ");
        }
        System.out.println(" |");
    }

    public int getActiveShips() {
        int activeShips = 0;
        for (int i = 0; i < theShips.length; i++) {
            if (!theShips[i].isSunk()) {
                activeShips++;
            }
        }
        return activeShips;
    }
    public void draw() {
        drawColumnNames();
        drawHorizLine();
        for (int i = 0; i < theBoard.length; i++ ) {
            drawRow(theBoard[i], i);
        }
        drawHorizLine();
    }

    public boolean processMove(Position p) {
        if (theBoard[p.getRow()][p.getColumn()] == SEA_CHAR) {
            theBoard[p.getRow()][p.getColumn()] = BOMB_CHAR;
            return false;
        }
        if (theBoard[p.getRow()][p.getColumn()]==BOMB_CHAR) {
            return false;
        }
        char theShipChar = theBoard[p.getRow()][p.getColumn()];
        for (int i = 0; i < theShips.length; i++) {
            if (theShips[i].getImage()==theShipChar) {
                System.out.println("Checking " + theShips[i] + " for collision");
                if (theShipChar=='b') {
                    if (theShips[i].canHit(p)) {
                        System.out.println("Ship " + theShips[i].getImage() + " has been hit");
                        theShips[i].hasBeenHit();
                        theBoard[p.getRow()][p.getColumn()] = BOMB_CHAR;
                    } else {
//                        System.out.println(p + " " + p.getRow() + " " + p.getColumn() + " did not hit " + theShips[i]);
                    }
                } else {
                    System.out.println("Ship " + theShips[i].getImage() + " has been hit");
                    theShips[i].hasBeenHit();
                    theBoard[p.getRow()][p.getColumn()] = BOMB_CHAR;
                }
            }
        }
        return true;
    }

    public Position getMove() {
        Position p = new Position(getRandom(0, theBoard.length),
                getRandom(0, theBoard[0].length));
        return p;
    }
}
