package com.education.note.tostring;

public class ToStringInDetails {

    public static void main(String[] args) {

       // int a=56;
       // System.out.println(a);

        Student ram = new Student("ram",22);
        Student ram2 = new Student("ram",22);

        System.out.println(ram.equals(ram2));


        System.out.println(ram); //com.education.note.tostring.Student@a09ee92

        System.out.println(ram.hashCode());

        String hx = Integer.toHexString(ram.hashCode());
        System.out.println(hx);



    }
}

class Student{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {

       /* String cln =this.getClass().getName();
        int hc=this.hashCode();
        String hexhasCode=Integer.toHexString(hc);

        return cln+"@"+hexhasCode;*/

        return this.name +" "+this.age;

    }


    public boolean equals(Object obj) {

        Student ob= (Student)obj;

        return (this.age == ob.age && this.name.equals(ob.name));

    }


}


