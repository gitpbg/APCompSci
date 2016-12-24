package com.company;

/**
 * use the hText string below and use substring to make the word Harambe
 */
public class Main {
    public static String hText = "Hello Andrea be my assistant";

    static String makeHarambe(String input) {
        return input.substring(0, 1);
    }

    public static void main(String[] args) {
	    if (makeHarambe(hText).equals("Harambe")) {
            System.out.println("You did it.  Harambe thanks you");
        }
    }
}
