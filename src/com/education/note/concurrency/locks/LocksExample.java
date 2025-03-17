package com.education.note.concurrency.locks;

import java.util.concurrent.locks.*;



class LockExample {
    private final ReentrantLock reentrantLock = new ReentrantLock();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private int value = 0;

    // ReentrantLock
    public void reentrantLockExample() {
        reentrantLock.lock();
        try {
            value++;
            System.out.println(Thread.currentThread().getName() + " updated value: " + value);
        } finally {
            reentrantLock.unlock();
        }
    }

    // ReadWriteLock
    public void readWriteLockExample() {
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " reading value: " + value);
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public void writeLockExample() {
        readWriteLock.writeLock().lock();
        try {
            value++;
            System.out.println(Thread.currentThread().getName() + " wrote value: " + value);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();

        Runnable reentrantTask = new Runnable() {
            @Override
            public void run() {
                lockExample.reentrantLockExample();
            }
        };

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                lockExample.readWriteLockExample();
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                lockExample.writeLockExample();
            }
        };

        Thread abhinav = new Thread(reentrantTask, "Abhinav");
        Thread rajib = new Thread(readTask, "Rajib");
        Thread rohit = new Thread(writeTask, "Rohit");

        abhinav.start();
        rajib.start();
        rohit.start();
    }
}
