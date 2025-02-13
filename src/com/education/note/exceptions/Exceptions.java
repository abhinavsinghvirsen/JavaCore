package com.education.note.exceptions;

public class Exceptions {

    public static void main(String[] args) {



        int a=5;

       // int result =a/0;


        int []ax = new int[]{1,2,3};

      //  System.out.println(ax[5]);





        System.out.println("hello");



       int i= m1(5);
        System.out.println(i);


    }



  static  int m1(int i){


        if(i==1 || i==0){

            return 1;
        }

     return  i* m1(i-1);
    }

}
