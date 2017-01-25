package com.company;

public class Part1 {
    public static void main(String[] args) {
        final String USAGE = "1 param. - Integer";
        int number;
        if (args.length != 1){
            System.out.println(USAGE);
            return;
        }

        try {
            number = Integer.valueOf(args[0]);
        } catch (NumberFormatException e) {
            System.out.println(USAGE);
            return;
        }

        System.out.println(((number%10000)/1000+(number%1000)/100)==((number%100)/10+(number%10)/1));
    }
}
