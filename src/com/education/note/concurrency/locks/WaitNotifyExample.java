package com.education.note.concurrency.locks;

class Restaurant {

    private boolean foodReady = false;
   // private int customerserved =0;

    public synchronized void orderFood() {
        while (!foodReady) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting for food...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " got the food and is eating.");
       // foodReady = false;
       // notifyAll();
    }

    public synchronized void prepareFood() {
        System.out.println(Thread.currentThread().getName() + " is preparing food...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        foodReady = true;
       // customerserved=0;
        System.out.println(Thread.currentThread().getName() + " has prepared the food!");
       // notifyAll();
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        final Restaurant restaurant = new Restaurant();

        Thread mrSinh = new Thread(new Runnable() {
            @Override
            public void run() {
                restaurant.orderFood();
            }
        }, "Mr. Sinha");

        Thread mrRohan = new Thread(new Runnable() {
            @Override
            public void run() {
                restaurant.orderFood();
            }
        }, "Mr. Rohan");

        Thread mrArpita = new Thread(new Runnable() {
            @Override
            public void run() {
                restaurant.prepareFood();
            }
        }, "Mr. Arpita");

      /*  mrSinh.start();
        mrRohan.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mrArpita.start();*/


        mrArpita.start();
        mrArpita.join();
        mrSinh.start();


    }
}