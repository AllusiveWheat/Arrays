package com.company;
import java.io.*;
import java.util.Arrays;

public class Alphabetical {

    public static void main(String[] args){
        int n= 8;

        String[] names = {"Maddox", "SpaceOS","Skeet","Unotap","OTC","Aimware","Hippoman","TheBananaGamer0"};
        System.out.println(Arrays.toString(names));
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                //To compare one string with other strings
                if (names[i].equals(names[j])) {
                    //Swapping
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // print output array
        System.out.println(
                "The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}
