package com.education.note.inheritance.methooveridding;

public class MethodOveridingExample {

    public static void main(String[] args) {

        Parent obj = new Parent();
       // obj.m1();

    }
}


class Parent{

    private A m1(int d, String name){
       System.out.println("parent m1");
       return new A();

    }


    public static void sum(){


    }

    public  void sub(){


    }


}
class child extends Parent{

   protected    B m1(int a, String n){
        System.out.println("child m1");


         return new B();
     }

     public static void sum(){


     }

   /* public static void sub(){


    }*/

}


class A{


}
class B extends  A{


}
