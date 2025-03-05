package com.education.note.concurrency;

public class Synchronization {

    public static void main(String[] args) {


        BankAccount account = new BankAccount();

        Thread t1 = new WithdrawThread(account, "Ram");
        Thread t2 = new WithdrawThread(account, "Ali");

        t1.start();
        t2.start();


    }
}
class BankAccount {
    private int balance = 1000;

    public   void withdraw(int amount) throws InterruptedException {


        if (balance >= amount) {

           synchronized (this){
                System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);
                balance -= amount;
                System.out.println(balance);
                System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                Thread.sleep(3000);
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " Not enough balance to withdraw " + amount);
        }
    }

    public int getBalance() {
        return balance;
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;

    public WithdrawThread(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                account.withdraw(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

