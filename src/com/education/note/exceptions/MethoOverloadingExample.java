package com.education.note.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethoOverloadingExample {

    public static void main(String[] args) {

    }
}
class A {

    void sum() throws  CustomCheckedException{


    }
}

class B extends A{

    void sum() throws CustmOne {


    }

}



class CustomCheckedException extends IOException  {


}
class CustmOne extends  CustomCheckedException{


}

