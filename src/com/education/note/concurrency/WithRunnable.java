package com.education.note.concurrency;

public class WithRunnable {

    public static void main(String[] args) {


        //Thread Priority


        ThreadGroup math = new ThreadGroup("math");
        ThreadGroup phy = new ThreadGroup("phy");

        MyThreadR  obj = new MyThreadR();
        MyThreadR  obj2 = new MyThreadR();

        MyThreadRT x= new MyThreadRT();
        MyThreadRT  y = new MyThreadRT();

        Thread t5 = new Thread(math,x,"rex");
        Thread t6 = new Thread(phy,y,"trex");


        Thread t1 = new Thread(math,obj,"abhinav");
        Thread t2 = new Thread(phy,obj2,"ponitha");

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

        t5.start();
        t6.start();

    }
}
class MyThreadR implements Runnable{


    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+" -----"+Thread.currentThread().getThreadGroup().getName()+Thread.currentThread().getPriority());
    }
}

class MyThreadRT implements Runnable{


    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+" -----"+Thread.currentThread().getThreadGroup().getName());
    }
}