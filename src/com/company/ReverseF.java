package com.company;
import java.util.*;
public class ReverseF {


    public static void main(String[] args) {
        int[] temp = reverseArray();
        System.out.println(Arrays.toString(temp));
        //Print  in here the array from ^
    }

    private static int[] reverseArray() {
        int[] x = new int[2];
        x[0] =2142452423;
        x[1]=56456464;
        for (int i = 0; i < x.length / 2; i++) {
            int temp = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - 1 - i] = temp;
            //Or can you print in here?
            Arrays.toString(x);
        }
        return x;
    }
}




