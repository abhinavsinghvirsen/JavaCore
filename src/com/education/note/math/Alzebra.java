package com.education.note.math;

public class Alzebra {

    public static double mul(double...input){

        double sum=0;
        for (double d:input) {

            sum=sum*d;
        }

        return  sum;

    }
}
