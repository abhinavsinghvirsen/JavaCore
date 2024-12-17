package com.education.note.math;

public class MathFormula {

    public static final double PI = 3.14159;

    public final int  num=333;

    public static double add(double... input){

        double sum=0;
        for (double d:input) {

            sum=sum+d;
        }

        return  sum;

    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }



}
