package com.education.note.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingExample {

    public static void main(String[] args) {

        /*Thread th =Thread.currentThread();
        System.out.println(th.getName());


        CustomThread t1 = new CustomThread();
        t1.start();*/

      /*  ThreadRunable obj = new ThreadRunable();
        Thread th = new Thread(obj);
        th.start();*/



        /**by using Anonymous class**/


        /*Thread tha = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi i am thread created by implementing  anonymous");

                Thread th =Thread.currentThread();
                System.out.println("hi i am thread"+th.getName());
                for(int i=0;i<10;i++){
                    System.out.println(i);

                }
            }
        });

        tha.start();*/


       /* // using lambda

        Thread thl = new Thread(()->{
            System.out.println("Hi i am thread created by lambda impl  ");

            Thread th =Thread.currentThread();
            System.out.println("hi i am thread"+th.getName());
            for(int i=0;i<10;i++){
                System.out.println(i);

            }

        });
        thl.start();
*/


        //By using Executor API

        ExecutorService exe = Executors.newFixedThreadPool(3);

        for(int i=0;i<10;i++){
            exe.execute(()->{System.out.println("Hi i am thread created by exe impl  ");

                Thread th =Thread.currentThread();
                 System.out.println("hi i am thread"+th.getName());


            });

        }

        exe.shutdown();




    }
}

/**four ways to create thread**/
/*** Extending Thread class*/

class CustomThread extends  Thread{

    public void run(){

        Thread th =Thread.currentThread();
        System.out.println("hi i am thread"+th.getName());

        for(int i=0;i<10;i++){
            System.out.println(i);

        }

    }




}


/*** by implementing runnable  Thread class*/

class ThreadRunable implements Runnable{


    @Override
    public void run() {

        System.out.println("Hi i am thread created by implementing  runnable");

        Thread th =Thread.currentThread();
        System.out.println("hi i am thread"+th.getName());
        for(int i=0;i<10;i++){
            System.out.println(i);

        }

    }
}



