package com.education.note.stringall;

public class StringSExample {

    public static void main(String[] args) {


       String str = new String("Abhinav");
       StringBuilder strb = new StringBuilder("abhinav");

        System.out.println(str.hashCode());
        System.out.println("----"+strb.hashCode());

        System.out.println(str.charAt(3));
        System.out.println(str.substring(1,5));

        System.out.println();





    }
}
