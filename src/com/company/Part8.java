package com.company;

public class Part8 {

    public static void main(String[] args) {
        final String USAGE = "1 params. - Integer";
        int a;


        if (args.length != 1){
            System.out.println(USAGE);
            return;
        }

        try {
            a = Integer.valueOf(args[0]);
        } catch (NumberFormatException e) {
            System.out.println(USAGE);
            return;
        }

        System.out.println(sum(new int[]{3, 5, 6, 4, 3, 7, 8, 12},a));

    }

    public static int sum(int[] data,int k){
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % k ==0) {
                result += data[i];
            }
        }
        return result;
    }
}
