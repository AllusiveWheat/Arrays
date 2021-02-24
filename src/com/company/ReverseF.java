package com.company;


public class ReverseF {

    public static int[] reverseArray(int[] x) {
        for (int i = 0; i < x.length / 2; i++) {
            int temp = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - 1 - i] = temp;
            //Or can you print in here?
        }
        return x;


    }

    public static void main(String[] args) {
        //Print  in here the array from ^
    }
}



