package com.education.note;

public class InheritanceExample {
    public static void main(String[] args) {

        P obj = new P();
       // System.out.println(obj.a);
        //System.out.println(obj.b);
       // obj.m1();
       // obj.m2();

        C cobj = new C();
        System.out.println(cobj.a);
        System.out.println(cobj.b);

        cobj.m1();
        cobj.m2();

        D objd= new D();
        objd.m3();

    }


}

   class P{
     int a=20;

     void m1(){

         System.out.println("p a value"+a);
        // System.out.println("C b value"+b);

     }

   }
    class C extends  P{
    int b=50;

   void m2(){
       System.out.println("p a value"+a);
       System.out.println("C b value"+b);
    }

}
class D extends  C{
  int d=60;

    void m3(){
        System.out.println("p a value"+a);
        System.out.println("C b value"+b);
        System.out.println("D d value"+d);
    }

}
