package com.company;

public class Part9 {

    public static void main(String[] args) {
        final String USAGE = "1 params. - Integer";
        int k = 0;


        if (args.length != 1){
            System.out.println(USAGE);
            return;
        }

        try {
            k = Integer.valueOf(args[0]);
        } catch (NumberFormatException e) {
            System.out.println(USAGE);
            return;
        }

        Object[] res = insert(new Object[]{3,2,5,6,7},new Object[]{"d","a","j"},4);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static Object[] insert(Object[] firstArray,Object[] secondArray, int k) {
        Object[] result = new Object[firstArray.length + secondArray.length];
        int j = 0;

        for (int i = 0; i < result.length; i++) {
            while (((i >= k)||(i >= firstArray.length))&&(j < secondArray.length)){ //inserting second array
                result[i] = secondArray[j];
                j++;
                i++;
            }
            if (i >= result.length) {break;}
            result[i] = firstArray[i-j];
        }

        return result;
    }
}
