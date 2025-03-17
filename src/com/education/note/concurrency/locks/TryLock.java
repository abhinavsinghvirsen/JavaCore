package com.education.note.concurrency.locks;

import java.util.concurrent.locks.ReentrantLock;

public class TryLock {
    public static void main(String[] args) {
        //    Nonblocking ATM access
        SbiAtm atm = new SbiAtm();

        Thread ram = new Thread(() -> atm.withdraw("Ram"));
        Thread jhon = new Thread(() -> atm.withdraw("Jhon"));
        Thread max = new Thread(() -> atm.withdraw("Max"));
        Thread roy = new Thread(() -> atm.withdraw("Roy"));

        ram.start();
        jhon.start();
        max.start();
        roy.start();
    }
}

class SbiAtm {
    private final ReentrantLock lock = new ReentrantLock();

    public void withdraw(String customer) {
        boolean status = false;

        try {
            status = lock.tryLock();
            if (status) {
                System.out.println("Customer " + customer + " is withdrawing money.");
                Thread.sleep(1000);
            } else {
                System.out.println("Customer " + customer + " could not acquire the lock. Try again later.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (status) {
                lock.unlock();
            }
        }
    }
}