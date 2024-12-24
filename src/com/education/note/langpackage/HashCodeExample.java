package com.education.note.langpackage;

import java.util.Objects;

public class HashCodeExample {

    public static void main(String[] args) {

         Person obj1 = new Person("abhinav","tatanagar",123);
         Person obj2= new Person("abhinav","tatanagar",123);
         Person obj3= obj1;

         int a=56;
         int b=56;
        System.out.println(obj1==obj3);

        System.out.println(obj1.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj1);
        System.out.println(obj3);



        System.out.println(obj1.equals(obj2));


    }



}
class Person{

    String name;
    String origin;
    int adharID;


    public Person(String name, String origin,int adharID) {
        this.name = name;
        this.origin = origin;
        this.adharID=adharID;
    }

    @Override
    public boolean equals(Object o) {
        Person p = (Person) o;

      boolean flag=this.name.equals(p.name) && this.adharID==p.adharID && this.origin.equals(p.origin);

        return flag;

         }

    @Override
    public int hashCode() {
        return Objects.hash(name, origin, adharID);
    }

/* @Override
    public int hashCode() {
        return adharID;
    }*/
}