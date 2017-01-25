package com.company;

import static java.lang.Math.pow;

public class Part3 {

    public static void main(String[] args) {
        final String USAGE = "2 params. - double";
        double a;
        double b;

        if (args.length != 2){
            System.out.println(USAGE);
            return;
        }

        try {
            a = Double.valueOf(args[0]);
            b = Double.valueOf(args[1]);
        } catch (NumberFormatException e) {
            System.out.println(USAGE);
            return;
        }

        System.out.println("Square of triangle is: " + 0.5 * a * b + "\nPerimeter of triangle is: " +
                (a + b + pow(pow(a,2)+pow(b,2),0.5)));

    }

}
