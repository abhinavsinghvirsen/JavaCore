package com.education.note.exceptions;

public class TryCatch {

    public static void main(String[] args) {

        System.out.println(" flow 1"); //p
        try {
            System.out.println(" flow 2"); //p
             int c=Integer.parseInt("C#");
          //  System.exit(0);

           // return;
           System.out.println(" flow 3"); //N

        }catch (NullPointerException e){
            System.out.println(" flow 4"); //N
            e.printStackTrace();
        }catch (NumberFormatException e){

            try {
                int x = 5 / 0;
            }catch (ArithmeticException x){
                System.out.println("test"); //P
            }
            System.out.println("vip"); //p
        }


        finally {
            System.out.println("flow 5");  //p
        }

        System.out.println(" flow 6");  //p

        System.out.println(" flow 7"); //p


    }
}
