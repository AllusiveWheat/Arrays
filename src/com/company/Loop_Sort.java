package com.company;
import java.util.Arrays;
public class Loop_Sort {
    public static void main(String[] args) {
    int[] intArray = {69,67,454,23254,454543,23432424,11342343};
    int temp = 0;

    //Print original array
        System.out.println("Original array: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        // Sort  Array in  Ascending Order
        for(int i  = 0; i <intArray.length; i++) {
            for (int  j = i+1;  j< intArray.length; j++) {

                if(intArray[i] > intArray[j]) {
                    temp  = intArray[i];
                    intArray[i]    = intArray[j];
                    intArray[j]  =  temp;
                }
            }
        }
        //  Print Sorted Array
       System.out.println("Array  sorted  in ascending order ");
        for(int i = 0; i<intArray.length; i++){
            System.out.print(intArray[i] + " ");


        }
    }
}

