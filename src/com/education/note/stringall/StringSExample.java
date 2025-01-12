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

        String strx ="AB";
        String stry = new String("AB");

        System.out.println(strx.hashCode());
        System.out.println(stry.hashCode());

        String strw="i am abhInav kuMar singh";

        String []a=strw.split(" ");

        System.out.println(a.length);

        for (String x:a){
            System.out.println(x);
        }

        System.out.println(strw.concat(" from blr"));

        //

        for(int i=0;i<strw.length();i++){

           // int  c = ;

           /* if(c>65 && c<97){

                System.out.println((char)c);
            }*/

            if(Character.isUpperCase(strw.charAt(i))){

                System.out.println(strw.charAt(i));

            }




        }



           StringBuffer strBuff= new StringBuffer("hello");
           StringBuffer strBuff2 = new StringBuffer("hello");

         System.out.println(strBuff.hashCode());
         System.out.println(strBuff2.hashCode());

        System.out.println(strBuff==strBuff2);
        System.out.println(strBuff.toString().equals(strBuff2.toString()));

        System.out.println(strBuff.reverse());

        strBuff.setLength(8);
        strBuff.append("gdsgsdgsdgsdgsdg");
        System.out.println(strBuff);


        StringBuffer strZ = new StringBuffer("mumbai");

        strZ.insert(0,"delhi ");
        strZ.insert(12," BLR ");
        strZ.delete(0,6);
        System.out.println(strZ);




    }
}
