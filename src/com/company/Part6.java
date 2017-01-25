package com.company;

public class Part6 {

    public static void main(String[] args) {
        final String USAGE = "3 params. - double";
        double[] a = new double[3];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        if (args.length != 3){
            System.out.println(USAGE);
            return;
        }

        try {
            a[0] = Double.valueOf(args[0]);
            a[1] = Double.valueOf(args[1]);
            a[2] = Double.valueOf(args[2]);
        } catch (NumberFormatException e) {
            System.out.println(USAGE);
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (a[i] < min){
                min = a[i];
            } if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(min + max);
    }
}
