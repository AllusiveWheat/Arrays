package com.company;
import java.util.*;
public class GetHyp {

    public static double getHyp(double HypW, double HypH) {
        double hyp;
        hyp = Math.sqrt(Math.pow(HypW, 2) + Math.pow(HypH, 2));
        return  hyp;
    }

    public static double getA(double Hyp, double HypB) {
        double getA = Math.sqrt(Math.pow(Hyp, 2) - Math.pow(HypB, 2));
        return getA;
    }

    public static double getB(double Hyp, double HypA) {
        double getB = Math.sqrt(Math.pow(Hyp, 2) - Math.pow(HypA, 2));
        return getB;
    }


    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
          /*
            System.out.print("Enter C: ");
            double c = sc.nextDouble();
            System.out.print("Enter B: ");
            double b = sc.nextDouble();
            double A = getA(c, b);
            System.out.println("A is: " + A); */
            System.out.print("Enter A Number:" );
            int num = sc.nextInt();
            System.out.println("Your number is "+ num);
            int y= (int) Math.cbrt(num);
            System.out.println("The Cube root of your Number is "+ y);
        }
        catch(Exception e) {

            System.out.println(e);
        }
    }
}
