package com.company;
import java.util.Arrays;
import java.util.Collections;

public class Array {
    public  static void main(String[]args) {
        String names[] = { "Ben","Alex" ,"Charlie" ,"Connor", "Cyrus","Eileen","Ella","Ellis","Peter","Edwin","Nico","Trevor","Tucker","Skye"};
        System.out.printf("Original Array: \n%s\n\n", Arrays.toString(names));

        // Sort Array in ascending Order

        Arrays.sort(names);
        System.out.printf("Array sorted in ascending order: \n%s\n\n",
                Arrays.toString(names));
        // Sort Array in Descending order
            Arrays.sort(names, Collections.reverseOrder());
        System.out.printf("Array sorted in descending order : \n%s\n\n",
                Arrays.toString(names));
    }}

