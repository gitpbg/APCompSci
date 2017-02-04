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
/*        System.out.println("K is at " + ('K'-'A') + " because K is at " + (int)('K') + " and A is at " + (int)('A'));
        System.out.println("k is at " + ('k'-'a') + " because k is at " + (int)('k') + " and a is at " + (int)('a'));
        String tmp = "01234";
        for (int i = 0; i < tmp.length(); i++) {
            char c = tmp.charAt(i);
            int idx = (int)c;
            System.out.println(c + " is index " + idx);
        }
    */
	// write your code here
//        StringsTest.letterFrequency("Hello World");
//        StringsTest.letterFrequency("the quick brown fox jumps over the lazy dog");
//        StringsTest.letterFrequency("SPHINX OF BLACK QUARTZ JUDGE MY VOWEL");
        StringsTest.words("Oh Say Can You See");
//        StringsTest.consonantsDigitsAndVowels("I have 20 fingers and toes");
//        StringsTest.reverse("Able was I ere I saw Elba");
//        StringsTest.isNumber("1949");
//        StringsTest.isNumber("74-7");
        checkToNumber(1234);
        checkToNumber(3141);
        try {
            StringsTest.toNumber("13 45");
            System.out.println("Exception not thrown");
        } catch (NumberFormatException nfe) {
            System.out.println("Exception thrown as expected");
        }
        WrapperClasses();
    }
    public static void WrapperClasses() {
        Integer i = new Integer(10);
        i = 20;
        Float f = 2.3f;
        Double d = 3.4;

        Math.

    }
}
