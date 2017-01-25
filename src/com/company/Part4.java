package com.company;

import static java.lang.Math.*;

public class Part4 {

    public static void main(String[] args) {
        final String USAGE = "2 params. - double x,y";
        double x;
        double y;
        if (args.length != 2){
            System.out.println(USAGE);
            return;
        }

        try {
            x = Double.valueOf(args[0]);
            y = Double.valueOf(args[1]);
        } catch (NumberFormatException e) {
            System.out.println(USAGE);
            return;
        }

        System.out.println((abs(x) < 3) && (y > -3)&&(y < 0) ||
                ((y >=0)&&(y < 3)&&(abs(x) < 3)));
    }


}
