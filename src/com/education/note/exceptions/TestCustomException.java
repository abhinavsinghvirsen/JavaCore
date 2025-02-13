package com.education.note.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class TestCustomException {
    public static void checkAgeLimit(int age ) throws InvliadAgeException, IOException {

        if(age <20){
            throw  new InvliadAgeException("you are under age for marriage act!");
        }

    }
    public static void main(String[] args) throws InvliadAgeException, IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age for marriage vliadation");
        int age = sc.nextInt();
        checkAgeLimit(age);
    }
}





class InvliadAgeException extends  Exception{

     InvliadAgeException(String msg){
        super("invalid Age Exception!");

    }


}
