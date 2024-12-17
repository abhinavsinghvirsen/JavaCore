package com.education.note.interfaceexample;

public class InterfaceExample {

    public static void main(String[] args) {

        Shape obj = new A();
        obj.area();




    }
}

interface Shape{
         int a = 6;
         int b=20;

         void  area();


}

interface  Design{

    int x=45;
    void drawing();


}

interface  Design4 extends Design{

    int x=45;
    void drawing();


}


 class A implements Shape,Design{


    @Override
    public void area() {

        System.out.println( Shape.a *Shape.b);
        System.out.println("hello find area");
    }

    @Override
    public void drawing() {
        System.out.println(Design.x);
    }
}

class B implements Shape,Design{


    @Override
    public void area() {

        System.out.println( Shape.a *Shape.b);
        System.out.println("hello find area");
    }

    @Override
    public void drawing() {
        System.out.println(Design.x);
    }
}



