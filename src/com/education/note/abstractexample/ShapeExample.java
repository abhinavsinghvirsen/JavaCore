package com.education.note.abstractexample;

public class ShapeExample {

    public static void main(String[] args) {


        Rectangle obj = new Rectangle(4,5);
        //obj.area();
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
        System.out.println(obj.intro());
    }

}


abstract  class Shape{


    private String temp;

    Shape(String x){
this.temp=x;
    }

    static final double PI=3.14;

    abstract   double area();
    abstract double perimeter();

  static String intro(){

        System.out.println("its Shape class");

        return "hello i am intro from shape class";
    }


}

class Rectangle extends  Shape{


    private  double width;
    private  double height;

    public Rectangle(double width, double height) {
        super("abhinav");
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {

      double  res =width * height*PI;

        return res;
    }

    @Override
    double perimeter() {
        return 2*(width*height);
    }
}

abstract  class A{
    A(){

    }

    abstract  void m1();


}
abstract  class B extends A{

    B(){

    }

    abstract void m2();


}
class C extends B{

    @Override
    void m1() {

    }

    @Override
    void m2() {

    }
}
