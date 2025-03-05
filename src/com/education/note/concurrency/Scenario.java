package com.education.note.concurrency;

public class Scenario {

    public static void main(String[] args) {

        Hello h1 = new Hello();
        Hello h2 = new Hello();


        Thread t1 = new Thread(() -> h1.m1(), "Thread A");
        Thread t2 = new Thread(() -> h2.m2(), "Thread B");
        t1.start();
        t2.start();


    }


}

class Hello {



       static synchronized void m1() {

        System.out.println("m1() started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println("m1() ended by " + Thread.currentThread().getName());
    }

  static   synchronized  void m2() {
        System.out.println("m2() started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println("m2() ended by " + Thread.currentThread().getName());
    }
}
