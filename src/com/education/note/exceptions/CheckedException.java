package com.education.note.exceptions;

import java.io.*;


public class CheckedException {

    public static void main(String[] args)  {

        try {
            m1();
        }catch (Exception e){

            System.out.println("exception handled");
        }

    }

    public  static void m1() throws Exception {



            FileReader f = new FileReader("a.txt");
            BufferedReader br = new BufferedReader(f);
            String lin = br.readLine();
            System.out.println(lin);
            br.close();



    }

}
