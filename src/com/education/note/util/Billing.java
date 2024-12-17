package com.education.note.util;


import java.lang.*;

import com.education.note.math.Alzebra;
import com.education.note.math.MathFormula;


public class Billing {

    public static void main(String[] args) {



         String name= "abhinav";

        double totalbill= MathFormula.add(10,20,30,40,50,60);
        double total= Alzebra.mul(10,20);

        System.out.println(name+"total purchase bill"+totalbill);

    }
}
