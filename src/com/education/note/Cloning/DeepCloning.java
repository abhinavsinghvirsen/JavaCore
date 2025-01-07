package com.education.note.Cloning;

public class DeepCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
          X obj = new X(5);
          W wobj = new W(5);
          Y objr = new Y(45,obj,wobj);
          Y objc = (Y) objr.clone();



         Y obj1 = (Y) objr.clone();
         Y obj2 = (Y) objr.clone();

         obj1.val= obj1.val+20;


         if(obj1.val<obj2.val){


         }















        System.out.println(objc);
        System.out.println(objr);

        objc.wref.a=96;

        System.out.println("------after update");

        System.out.println(objc);
        System.out.println(objr);
    }
}


class X{

    int a;

    public X(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "X{" +
                "a=" + a +
                '}';
    }
}

class W{

    int a;

    public W(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "X{" +
                "a=" + a +
                '}';
    }
}

class Y implements Cloneable{

    int val;
    X xref;
    W wref;

    public Y(int val, X xref,W wref) {
        this.val = val;
        this.xref = xref;
        this.wref =wref;
    }

    public Object clone() throws  CloneNotSupportedException{

        if(this instanceof Cloneable){

            X obj = new X(this.xref.a);
            W wobj= new W(this.wref.a);

            Y yobj = new Y(this.val,obj,wobj);

            return yobj;
        }else{

            throw new CloneNotSupportedException();
        }


    }


    @Override
    public String toString() {
        return "Y{" +
                "val=" + val +
                ", xref=" + xref +
                ", wref=" + wref +
                '}';
    }
}