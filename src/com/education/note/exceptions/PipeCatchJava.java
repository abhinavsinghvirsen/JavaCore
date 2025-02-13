package com.education.note.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PipeCatchJava {

    public static void main(String[] args) {

        try{

           int r=5/0;
        }catch (Exception e){


            if(e instanceof  ArithmeticException){
                System.out.println(" Arithematic exception");

            }
            if(e instanceof  NullPointerException){
                System.out.println(" NullPointerException  exception");

            }




        }


    }



}
