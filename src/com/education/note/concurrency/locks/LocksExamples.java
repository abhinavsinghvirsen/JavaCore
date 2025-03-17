package com.education.note.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LocksExamples {

    public static void main(String[] args) {

     // BankAccount obj = new BankAccount(1500);

      Books objx= new Books();

      Thread sumit = new Thread(()->{
        //  obj.withdraw(900);
          objx.read("sumit");
      },"sumit");
        Thread neha = new Thread(()->{
            //  obj.withdraw(900);
            objx.read("neha");

        },"neha");

      Thread abhinav = new Thread(()->{

          objx.write("C++ book");
          //obj.withdraw(600);

      },"abhinav");

        Thread krithik = new Thread(()->{

            objx.write("java in details");
            //obj.withdraw(600);

        },"krithika");



        sumit.start();
        abhinav.start();
        neha.start();
        krithik.start();

    }


}

class BankAccount{

    private double balance;

    private final Lock lock = new ReentrantLock(true);


    BankAccount(double d){
        this.balance=d;

    }


    public void withdraw(double amount){

        lock.lock();
        try {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " processing withdrawl");
                balance = balance - amount;
                System.out.println("withdrawl completed recent balance ==" + balance);

            } else {

                System.out.println("insufficient balance");
            }
        }catch (Exception e){


        }finally {

            lock.unlock();
        }




    }


}

class Books{

    private String book = "java in depth";
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(String reader){
        lock.readLock().lock();

        System.out.println(Thread.currentThread().getName()+"reading");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.readLock().unlock();
        }

    }

    public void write(String nbook){

        lock.writeLock().lock();
        book=nbook;
        System.out.println(Thread.currentThread().getName()+"writing");
        System.out.println(nbook);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }


    }


}
