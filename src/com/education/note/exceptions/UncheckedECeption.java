package com.education.note.exceptions;

public class UncheckedECeption {

    public static void main(String[] args) {


        try{
            m1();
        }catch (Exception e){
            System.out.println("hello exception ");

        }

    }


    public static void  m1(){

        int result=50/0;
    }
}
