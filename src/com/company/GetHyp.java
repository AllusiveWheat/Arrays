package com.company;
import java.util.*;
public class GetHyp {

    public static double getHyp(double HypW, double HypH) {
        double hyp;
        hyp = Math.sqrt(Math.pow(HypW, 2) + Math.pow(HypH, 2));

        return hyp;

    }

    public static double getA(double Hyp, double HypB) {
        double getA;
         getA = Math.sqrt(Math.pow(Hyp, 2) - Math.pow(HypB, 2));

        return getA;
    }

    public static double getB(double Hyp, double HypA) {
        double getB;
        getB = Math.sqrt(Math.pow(Hyp, 2) - Math.pow(HypA, 2));

        return getB;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A ");
        double a= sc.nextDouble();
        System.out.print("Enter B ");
        double b= sc.nextDouble();
        double hyp = getHyp(a,b);
        System.out.println("The hypotenuse is " + hyp);

        }
}
