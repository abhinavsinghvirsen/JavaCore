package com.education.note.inheritance.methooveridding;

public class MethodOverRidingSUBLevel {

    public static void main(String[] args) {


         P obj = new C();

         obj.printS(); //dynamic polymorphism

        obj= new P();
        obj.printS();

    }
}
// covariant retrun type
class P{


    void printS(){
        System.out.println("super prints called ");


    }



    public   Number print(){

        return 15;
    }

}
   class C extends  P{

       void printS(){

           super.printS();

           System.out.println("Child prints called ");


       }

    public Integer print(){
        return 15;
    }
}