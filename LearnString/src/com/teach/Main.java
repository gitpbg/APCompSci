package com.teach;

public class Main {

    public static void main(String[] args) {
        /* we will learn all about the string object here */
        /* How are strings created */
        String s1 = "Hello World"; // Create a string object with the content "Hello" and store it in s1
        String s2 = new String(); // Create a string object with the content "" (empty string) and store it in s2

        //length() returns the length of the string
        System.out.println(s1.length());
        System.out.println(s2.length());

        if (s1.isEmpty()) {
            System.out.println("how did this happen ???");
        } else {
            System.out.println("s1 is not empty");
        }
        if (s2.isEmpty()) {
            System.out.println("s2 is empty");
        } else {
            System.out.println("how did this happen ???");
        }
        // charAt returns the character at a particular index
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

        char firstFive [] = new char[5];
        firstFive[0] = 'J';
        s1.getChars(1, 5, firstFive, 1);
        String tmp = new String(firstFive);
        System.out.println(tmp);

        // equals will return true only if the parameter is a String and
        // has the same characters as the string that you are testing against
        if (s1.equals("Hello World")) {
            System.out.println("Strings are equal");
        }
        if (!s1.equals(null)) {
            System.out.println("s1 is not equal to null");
        }
        Object o = new Object();
        if (!s1.equals(o)) {
            System.out.println("s1 and o are not equal");
        }

        //to compare with ignoring case use equalsIgnoreCase
        String s3 = "heLLo wORld";
        if (s1.equalsIgnoreCase(s3))
            System.out.println(s1 + " is equal to " + s3);

        //Starts with
        System.out.println(s1.startsWith("Hell"));
        System.out.println(s1.startsWith("llo", 2));

        // endsWith
        System.out.println(s1.endsWith("rld"));

        //indexOf
        System.out.println(s1.indexOf(' '));
        int pos = s1.indexOf('l');
        System.out.println("First occurence of l is " + pos);
        pos = s1.indexOf('l', pos+1);
        System.out.println(pos);
        pos = s1.indexOf('l', pos+1);
        System.out.println(pos);
        pos = s1.indexOf('l', pos+1);
        System.out.println(pos);

        //lastIndexOf will return the farthest character matching the param
        System.out.println(s1.lastIndexOf('l'));
        // index of works for strings
        System.out.println(s1.indexOf("orl"));

        //substring returns the string starting at index n
        System.out.println(s1.substring(6));

        System.out.println(s1.substring(2, 4));


        // replace
        System.out.println(s1.replace('H', 'J'));
        System.out.println(s1.replace(" ", "<space>"));

        //contains
        System.out.println(s1.contains("lo"));
        String array[] = s1.split(" ");
        System.out.println(array.length + " pieces");
        String s4 = "dog; cat;   bird   ;   plane";
        String pieces[] = s4.split("a");
        for (String tmp2 : pieces) {
            System.out.println(tmp2);
        }
        pieces = s4.split(";");
        for (String tmp2 : pieces) {
            System.out.println("[" + tmp2 + "]");
        }

        for (String tmp2 : pieces) {
            System.out.println("[" + tmp2.trim() + "]");
        }
        int tmp2 = 33;
        System.out.println(String.format("%d %04d %08X", tmp2, tmp2, tmp2));
        //left align the names, right align the numbers to 3 digits
        System.out.println(String.format("%-10s %3d", "Akshay", 5));
        System.out.println(String.format("%-10s %3d", "Abhinav", 85));
        System.out.println(String.format("%-10s %3d", "Shivani", 85));

    }
}
