package com.education.note.concurrency;

public class ThreadNameAndGroup {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        ThreadGroup indian = new ThreadGroup("indian");
        ThreadGroup american = new ThreadGroup("american");


        MyThread th1= new MyThread(indian,"ram");
        MyThread th2= new MyThread(indian,"mohan");
        MyThread th3= new MyThread(indian,"karthik");


        MyThread th4= new MyThread(american,"peter");
        MyThread th5= new MyThread(american,"jhon");
        MyThread th6= new MyThread(american,"mark");

        th1.start();
        th2.start();
        th3.start();

        th4.start();
        th5.start();
        th6.start();



        System.out.println("post "+Thread.currentThread().getName());
        System.out.println("post "+Thread.currentThread().getThreadGroup().getName());

    }
}
class MyThread extends  Thread {

    MyThread(ThreadGroup t ,String name){
        super(t,name);

    }

  /*  @Override
    public void run() {


        System.out.println(Thread.currentThread().getName()+" -----"+Thread.currentThread().getThreadGroup().getName());


    }*/
}