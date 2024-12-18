package com.education.note.langpackage;

import com.education.note.util.Billing;

import java.util.Scanner;

public class SamplePackageExample {


    public  static void printDetials(Object obj){


      Class defaultObj=  obj.getClass();


        System.out.println(defaultObj.getName());
        System.out.println(defaultObj.getSuperclass().getName());







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

        printDetials(bobj);
       // printDetials(aobj);

    }
}


class A{


}
class B extends A{


}

