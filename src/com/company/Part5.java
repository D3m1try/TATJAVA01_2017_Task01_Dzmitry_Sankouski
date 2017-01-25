package com.company;

import static java.lang.Math.pow;

public class Part5 {

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

        if (a >= 0) {
            a = pow(a,2);
        } else {
            a = pow(a,4);
        }

        if (b >= 0) {
            b = pow(a,2);
        } else {
            b = pow(a,4);
        }

        if (c >= 0) {
            c = pow(a,2);
        } else {
            c = pow(a,4);
        }

    }
}
