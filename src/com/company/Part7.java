package com.company;

import static java.lang.Math.*;

public class Part7 {

    public static void main(String[] args) {
        final String USAGE = "3 params. - double a, b, h";
        double a;
        double b;
        double h;

        if (args.length != 3){
            System.out.println(USAGE);
            return;
        }

        try {
            a = Double.valueOf(args[0]);
            b = Double.valueOf(args[1]);
            h = Double.valueOf(args[2]);
        } catch (NumberFormatException e) {
            System.out.println(USAGE);
            return;
        }

        for (double i = a; i < b;) {
            System.out.println(i + " --> " + (pow(sin(i),2) - cos(2 * i)));
            i = i + h;
        }
    }
}
