package com.education.note;

public class SAMPLE {
    public static void main(String[] args) {

        Z obj = new Z();

    }
}

class X{

    protected  int a;

    X(){

        System.out.println("X");
    }

}

class Y extends X{

     Y(){
         System.out.println("Y");
     }
        }


        class Z extends Y{

    Z(){

        System.out.println("Z"+a);
    }
        }