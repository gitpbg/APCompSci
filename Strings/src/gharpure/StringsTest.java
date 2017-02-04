package gharpure;

/**
 * Created by gharpure on 12/16/16.
 * Intended to be coaching for the String class
 */
public class StringsTest {

    /**
     * This function will accept the given string and print out the count for each character from A-Z
     * e.g. for the string "Hello"
     * the output should look like:
     * A => 0
     * B => 0
     * C => 0
     * D => 0
     * ...
     * H => 1
     * ...
     * Z => 0
     * a => 0
     * b => 0
     * ...
     * e => 1
     * ...
     * l => 2
     * m => 0
     * n => 0
     * o => 1
     *
     * @param s - this is the string that needs to be analyzed
     */
    public static void letterFrequency(String s) {
        String uc="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String test = uc + uc.toLowerCase();
        int charCounts[] = new int[test.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = test.indexOf(c);
            if (idx >= 0) {
                charCounts[idx]++;
            }
        }

        for (int i = 0; i < test.length(); i ++) {
            if (charCounts[i]!=0)
                System.out.println(test.charAt(i) + " => " + charCounts[i]);
        }
    }

    /**
     * Print the # of consonants, digits and vowels in the string
     * e.g. "H3ll0 World" should print
     * Consonants: 7
     * Vowels: 1
     * Digits: 2
     *
     * @param s - this is the string to be analyzed
     */
    public static void consonantsDigitsAndVowels(String s) {
        String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
        consonants = consonants + consonants.toLowerCase();
        String vowels = "AEIOU";
        vowels = vowels + vowels.toLowerCase();
        String digits = "0123456789";
        int numConsonants = 0;
        int numVowels = 0;
        int numDigits = 0;
        int numSpaces = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx;
            char c = s.charAt(i);
            if (consonants.indexOf(c)>=0) {
                numConsonants++;
            } else if (vowels.indexOf(c) >= 0) {
                numVowels++;
            } else if (digits.indexOf(c) >= 0) {
                numDigits++;
            } else if (c==' ') {
                numSpaces++;
            }
        }
        System.out.println("Consonants: " + numConsonants);
        System.out.println("Vowels: " + numVowels);
        System.out.println("Digits: " + numDigits);
        System.out.println("Spaces: " + numSpaces);

    }
    /**
     * This function will break up the given string into words and print one line per word in the string
     * @param s - this is the string to break up
     */
    public static void words(String s) {
        // your implementation goes here
        do {
            int idx = s.indexOf(' ');
            if (idx < 0) {
                System.out.println(s);
                break;
            }
            String tmp = s.substring(0, idx);
            s = s.substring(idx+1);
            System.out.println(tmp);
        } while(s.length() > 0);
    }

    /**
     * This function will reverse the string so Hello will become olleH
     * @param s - this is the String to reverse
     */
    public static void reverse(String s) {
        //your implementation goes here
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        System.out.println(s);
    }


    /**
     * Check if the string is entirely made up of digits
     * "123" should return true
     * "H123" should return false
     * "123 " should return false
     * "12 3" should also return false
     * @param s - this is the string to analyze
     * @return true if the string is all digits, false otherwise
     */
    public static boolean isNumber(String s) {
        String digits = "0123456789";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (digits.indexOf(c) < 0) return false;
        }
        return true;
    }

    /**
     * Convert the String to a number, throw the NumberFormatException if the String is not a number.
     * @param s - the string to convert
     * @return the numeric value of the string
     * @throws NumberFormatException - exception thrown when the String is not a number
     */
    public static int toNumber(String s) throws NumberFormatException
    {
        if (!isNumber(s))
            throw new NumberFormatException(s + " is not a number");
        int rv = 0;
        int m = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int digit = c - '0';
            rv = rv * 10 + digit;
        }
        return rv;
    }
}
