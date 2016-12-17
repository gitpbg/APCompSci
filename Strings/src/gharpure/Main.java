package gharpure;

public class Main {

    private static void checkToNumber(int n) {
        if (StringsTest.toNumber(Integer.toString(n))!= n) {
            System.out.println("Failed for " + n);
        } else {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
	// write your code here
        StringsTest.letterFrequency("the quick brown fox jumps over the lazy dog");
        StringsTest.letterFrequency("SPHINX OF BLACK QUARTZ JUDGE MY VOWEL");
        StringsTest.words("Oh Say Can You See");
        StringsTest.consonantsDigitsAndVowels("I have 20 fingers and toes");
        StringsTest.reverse("Able was I ere I saw Elba");
        StringsTest.isNumber("1949");
        StringsTest.isNumber("74-7");
        checkToNumber(1234);
        checkToNumber(3141);
        try {
            StringsTest.toNumber("13 45");
            System.out.println("Exception not thrown");
        } catch (NumberFormatException nfe) {
            System.out.println("Exception thrown as expected");
        }
    }
}
