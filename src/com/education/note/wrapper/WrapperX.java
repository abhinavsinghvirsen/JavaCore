package com.education.note.wrapper;

public class WrapperX {

    public static void main(String[] args) {



            int a=  Integer.valueOf("123");
            int b=  Integer.valueOf(1);
           double d=  Double.valueOf("12.4");
           short c=  Short.valueOf("111");
           Character c1 = new Character('A');
           char c2 = c1.charValue();
           Integer it = new Integer("10");
           int x = it.intValue();
           double dc= it.doubleValue();



      Integer val =129;
      Integer val2=138;

      System.out.println(val==val2); //true


        Double dx= 123.0;
        Double dy= 123.0;
        System.out.println(dx==dy);


    Integer ax= new Integer(11);
    Integer ay= new Integer(11);

        System.out.println(ax==ay); // true


        Integer xm =120;
        System.out.println(xm.hashCode());
        xm++;
        System.out.println(xm.hashCode());


     Boolean bc= true;
     System.out.println(bc.hashCode());

        System.out.println(val.equals(val2));

        System.out.println(val.compareTo(val2));

      Integer as=50;
      Integer vl=50;

        System.out.println(as==vl);


    }

}
