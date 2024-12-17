package com.education.note;

public class Example2 {

    public static void main(String[] args) {

        // Parent obj = new Parent();


        Child obj = new Child();
    }
}

class Parent{

     int a;
     int b;


    Parent(){
        System.out.println("inside Parent Construtor ");
    }

    Parent(int a ,int b){
        this.a=a;
        this.b=b;
        System.out.println("parametrized construtor");
    }

}

class Child extends Parent{

    Child(){
        super();

    }


}