package com.education.note;

public class SuperExample {

    public static void main(String[] args) {


        Dog obj = new Dog("XYZ");
        obj.display();


        MiltiaryDog ob = new MiltiaryDog("mld");
        ob.display();

    }



}

class Animal {

    private   int b=100;

    int leg;
    int tail;
    String bree="abc";

    Animal(int x,int y){

        this.leg=x;
        this.tail=y;

    }

    void display() {

        System.out.println("Animal method");

    }

}
class Dog extends Animal {

    String bree;

    Dog( String breed) {

         super(4, 5);
         this.bree=breed;


    }

    void display() {
      // String bree="pmln";
      //  System.out.println(super.leg);
      //  System.out.println(super.tail);

      //  System.out.println(super.b);
      //  System.out.println("Dog method "+bree);  //
        System.out.println("DOG display method");
       super.display();

    }
}

class MiltiaryDog extends  Dog{


    MiltiaryDog(String breed) {

        super(breed);
        System.out.println("hhdd");
    }


    @Override
    void display() {
        System.out.println("mld display method");
        super.display();
    }
}
