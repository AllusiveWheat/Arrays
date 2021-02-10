package com.company;
public class Main {
    public static void main(String[] args) {
        int[] intArray  =  new int[] {69,62,43,5,6,123,5323,5774};
        int  temp  = 0;
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