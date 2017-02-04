package com.teach;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static final String STR_CENTIGRADE = "C";
    static final String STR_FAHRENHEIT = "F";

    static void print(float from, String scaleFrom, float to, String scaleTo) {
        System.out.println(String.format("%f degrees %s converts to %f degrees %s", from, scaleFrom, to, scaleTo));
    }

    public static void main(String[] args) {
        float c_zero = 0.0f;
        float f_zero = TemperatureConverter.CentigradetoFahrenheit(c_zero);
        float f_boil = 212.0f;
        float c_boil = TemperatureConverter.FahrenheitToCentigrade(f_boil);
        print(c_zero, STR_CENTIGRADE, f_zero, STR_FAHRENHEIT);
        print(f_boil, STR_FAHRENHEIT, c_boil, STR_CENTIGRADE);

        File f = new File("conversion.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            java.util.Scanner s = new Scanner(fis);
            while(s.hasNext()) {
                String conversionType = s.next();
                String what = s.next();
                /* add code to convert and print */
            }
        } catch(IOException ioe) {
            System.err.println("Could not open file");
        }
    }
}
