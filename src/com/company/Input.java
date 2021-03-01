package com.company;
import java.util.*;
public class Input {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 5, 6, 2, 67};
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter A Number:");
            int num = sc.nextInt();
            System.out.println("The index of the array at " + num + " is " + arr[num]);
        }
        catch(Exception e){
            System.out.println("Array was out of bounds");
            return;
        }
    }
}
