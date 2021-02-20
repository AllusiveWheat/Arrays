package com.company;

import java.util.Arrays;
import java.util.Collections;

public class More {
    public  static void main(String[]args) {
        int[] ints  ={69,420,1337};
        Integer[] rev = {69,420,1337};
        Arrays.sort(rev);
        System.out.println("Original Array is "+Arrays.toString(rev));
        Arrays.sort(rev, Collections.reverseOrder());
        System.out.println("Reversed order is "+ Arrays.toString(rev));

    }
}
