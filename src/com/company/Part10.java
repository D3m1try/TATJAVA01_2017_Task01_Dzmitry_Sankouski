package com.company;

public class Part10 {

    public static void main(String[] args) {
        final String USAGE = "1 params. - Integer";
        int n;

        if (args.length != 1) {
            System.out.println(USAGE);
            return;
        }

        try {
            n = Integer.valueOf(args[0]);
        } catch (NumberFormatException e) {
            System.out.println(USAGE);
            return;
        }

        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    result[i][j] = j + 1;
                } else {
                    result[i][j] = n - j;
                }
            }
        }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[i][j]);
                }
                System.out.println();
            }
        }
    }
