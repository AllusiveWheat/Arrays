package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] IntArray = {69, 32323242, 425432452, 35435, 345345, 535435, 453535, 3232, 23424243, 1353436535};
        // Print Original Array using Arrays.sort method
        System.out.printf("Original Array : %s" , Arrays.toString((IntArray)));
        // Sorted Using Arrays.sort
        Arrays.sort(IntArray);
        System.out.printf("Sorted Array : %s" , Arrays.toString((IntArray)));
        Arrays.sort(IntArray , Collections.reverseOrder());
        System.out.printf(" Reversed Sort Array : %s" , Arrays.toString((IntArray)));
    }
}
