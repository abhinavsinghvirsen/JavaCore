package com.education.note.Cloning;

public class CloningExample {

    public static void main(String[] args) throws CloneNotSupportedException {

      /* A obj = new A(34);
       A objc= (A) obj.clone();

        System.out.println("real"+obj +" "+obj.hashCode());
        System.out.println("cloen obj"+objc+ " "+objc.hashCode());

        objc.val=45;

        System.out.println("real"+obj +" "+obj.hashCode());
        System.out.println("cloen obj"+objc+ " "+objc.hashCode());*/
        B objb= new B("abhinav");

        A obj = new A(34,objb);

        A objc= (A) obj.clone();

        System.out.println("real"+obj +" "+obj.hashCode());
        System.out.println("cloen obj"+objc+ " "+objc.hashCode());


        objc.obj.name="rahul";

        System.out.println("real"+obj +" "+obj.hashCode());
        System.out.println("cloen obj"+objc+ " "+objc.hashCode());


    }
}

class A implements  Cloneable{

    int val;
    B obj ;

    public A(int val) {
        this.val = val;
    }

    public A(int val, B obj) {
        this.val = val;
        this.obj = obj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public String toString() {
        return "A{" +
                "val=" + val +
                ", obj=" + obj +
                '}';
    }
}




class B{

    String  name;

    public B(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }
}