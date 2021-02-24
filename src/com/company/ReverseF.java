package com.company;
import java.util.*;
public class ReverseF {


    public static void main(String[] args) {
        int[] temp = reverseArray();
        
        //Print  in here the array from ^
    }

    private static int[] reverseArray() {
        int[] arr = new int[2];
        arr[0] = 5;
        arr[1] = 6;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            //Or can you print in here?
            
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}




