package com.company;
import java.util.Arrays;
import java.util.Collections;
public class Gamer {
    public static void main(String[] args) {
        //Print Original Array
        String[] colors = {"Red" , "Black", "Blue" , "Yellow" , "Purple"};
        System.out.println("Original Array " + Arrays.toString(colors));

        //Print Array in Alphabetical Order
        Arrays.sort(colors);
        System.out.println("Sorted Array " + Arrays.toString(colors) );

        //Print Array in Revered Alphabetical Order
        Arrays.sort(colors , Collections.reverseOrder());
        System.out.println("Reversed Array " + Arrays.toString(colors));
    }
}
