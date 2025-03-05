package com.education.note.concurrency;

public class MainThreadFlow {
    public static void main(String[] args) {

        Thread th = Thread.currentThread();
        System.out.println(th.getName()); //main
        System.out.println(th.getThreadGroup().getName()); //main
        System.out.println("hello world");

    }
}
