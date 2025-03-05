package com.education.note.concurrency;



public class LifeCycleExample {

    public static void main(String[] args) {

        ThreadLifeExample th = new ThreadLifeExample();
        System.out.println(""+th.getName()+" NEW STATE");
        th.start();


        try {

            Thread.sleep(6000);

            synchronized (th){

                System.out.println(th.currentThread().getName()+"RUNNING STATE");
                System.out.println(th.getName()+"BLOCKED STATE");
                th.notifyAll();


            }

            Thread.sleep(4000);

            System.out.println(th.getName()+"DEAD OR TERMINATED");



        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"DEAD OR TERMINATED");
    }
}

class ThreadLifeExample extends Thread{

    @Override
    public void run() {

        System.out.println(""+Thread.currentThread().getName()+" RUNNING STATE");

        //TIMED_WAIT

        try {
            Thread.sleep(4000);
            System.out.println(""+Thread.currentThread().getName()+" TIMMED_WAITTING STATE");

            synchronized (this){
                System.out.println(""+this.getName()+" WAITTING  STATE");
                wait();
                System.out.println(""+this.getName()+" RUNNABLE  STATE");


            }



        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
