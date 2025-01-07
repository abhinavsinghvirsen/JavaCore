package com.education.note.mm;

public class FInalizeExample {

    public static void main(String[] args) {

        new Students().show(); //un used
        Students a1 = new Students(); // un used
        a1=null;

        Students a2 = new Students(); // unused
        Students a3 = new Students();
        a3=a2;


       new Students().m1();

       System.gc();




    }
}

class Students{

    public void  finalize(){
        System.out.println("Student Finalize");
    }

    public void show(){
        System.out.println("show()");
    }

    void m1(){
        System.out.println("m1-start");

        Address a1 = new Address();
        Address a2 = new Address();
        Address a3 = new Address();

        System.out.println("m1-end");

    }

}

class Address{

    public void  finalize(){

        System.out.println("Address Finalize");

    }
}