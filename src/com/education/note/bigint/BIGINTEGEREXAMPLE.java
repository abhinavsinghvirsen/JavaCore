package com.education.note.bigint;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BIGINTEGEREXAMPLE {

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE); //2147483647 +2147483647

        BigInteger  num1= new BigInteger("2147483647");
        BigInteger  num2= new BigInteger("2147483647");
        BigInteger result=num1.add(num2);
        System.out.println(result);


        BigDecimal d1=new BigDecimal(Double.MAX_VALUE);
        BigDecimal d2 = new BigDecimal("99999.0");
        BigDecimal resd= d1.add(d2);
        System.out.println(resd);
    }
}
