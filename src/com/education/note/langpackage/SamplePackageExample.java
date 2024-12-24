package com.education.note.langpackage;

import com.education.note.util.Billing;

import java.util.Arrays;
import java.util.Scanner;

public class SamplePackageExample {


    public  static void printDetials(Object obj){


      Class defaultObj=  obj.getClass();


        System.out.println(defaultObj.getName());







/*
        if(obj instanceof  A){

            System.out.println("A invoked");

        }

        if(obj instanceof  B){

            System.out.println("B  invoked");

        }
*/



    }



    public static void main(String[] args) {

        A aobj = new A();
        B bobj = new B();

        printDetials(aobj);
       // printDetials(aobj);

    }
}


class A{

   final  int a=0;


}
class B extends A{


}

