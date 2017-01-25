package com.company;


import static java.lang.Math.pow;

public class Part2 {

    public static void main(String[] args) {
        final String USAGE = "3 params. - double";
        double a;
        double b;
        double c;
        if (args.length != 3){
            System.out.println(USAGE);
            return;
        }

        try {
            a = Double.valueOf(args[0]);
            b = Double.valueOf(args[1]);
            c = Double.valueOf(args[2]);
        } catch (NumberFormatException e) {
            System.out.println(USAGE);
            return;
        }

        System.out.println((b + pow(b*b + 4 * a * c,0.5))/(2 * a) - pow(a,3) * c + pow(b,-2));

    }
}
