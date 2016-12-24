package gharpure;

/**
 * The goal of this assignment is to figure out the day of the week for a given date.
 * The formula is as follows:
 * Use the magic string: Worship God And Attain A Mind Devoid Of Anger Passion And Greed
 * (a) Get the day i.e 4th of July 2016 the day will be 4
 * (b) Notice that there are 12 words in the string above, use the length of the string for the month
 * as the code.
 * (c) Find the # of years since 1900
 * (d) Find the # of leap days since 1900 (note that if it is Jan in a leap year then you do not
 * count the leap day)
 *
 * (a+b+c+d)%7 gives you a number from 0-6 use that to index into an array of Weekday Names
 *
 * Suggestion:
 * Define the magic string as a static final String in the class that use implement the code
 * Define the array of week day names as a static final as well
 * Have an initialize function which converts the string to an integer array of lengths (note private member)
 * call this function from the class constructor
 *
 * Define a function String getWeekdayForDate(int yyyy, int mm, int dd) which will return the weekday
 * for the date
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
