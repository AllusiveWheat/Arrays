package com.company;
import java.util.Arrays;
public class Main {

    public static String[] studentNames(){
   /*Returns an array of all of the first names of students in
   this class, sorted alphabetically A->Z by first name
   Inputs: none
   Outputs:
       return: a String[] with alphabetized student first names
   Ex.
   studentNames() -> [Alexa, Ana, Benton, Ethan,...]
   */
        String[] studentNames = new String[15];
        studentNames[0] = "Alex";
        studentNames[1] = "Ben";
        studentNames[2] = "Charlie";
        studentNames[3] = "Connor";
        studentNames[4] = "Cyrus";
        studentNames[5] = "Edwin";
        studentNames[6] = "Eileen";
        studentNames[7] = "Ella";
        studentNames[8] = "Ellis";
        studentNames[9] = "Nico";
        studentNames[10] = "Peter";
        studentNames[11] = "Pippa";
        studentNames[12] = "Skye";
        studentNames[13] = "Trevor";
        studentNames[14] = "Tucker";
        //StdOut.println(Arrays.toString(studentNames));
        return studentNames;
    }

    public static void main(String[] args) {
        int x;
        x = 5;
        int y = 0;
        y /= x;
       System.out.println(y);

    }

    {


    }
}