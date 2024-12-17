package com.education.note.interfaceexample;

public class InterfaceFrame {

    public static void main(String[] args) {


        Mathy obj = new MathTest();
        int a = obj.a;
        System.out.println(a);
        obj.add(10,20);
        Mathy obj2 = new MathTest();
        obj.add(15,20);
    }
}


 interface  Mathx{  //private protected volatile and transient
    int a=20;
  int add(int a ,int b);

  int sum();

}

interface  Mathy extends Mathx{

    int a=30;
    int add(int a ,int b);
    int divide();

}

interface  MathZ extends  Mathy{
    int a=40;

    int add(int a ,int b);

    int sub();

}

class MathTest implements MathZ{


    @Override
    public int add(int x, int y) {

        System.out.println("MAth test impl"+Mathx.a);
        return x+y;
    }

    @Override
    public int sum() {
        return 0;
    }

    @Override
    public int sub() {
        return 0;
    }

    @Override
    public int divide() {
        return 0;
    }
}

