package com.learning.highschool.threads;

public class ThreadSample {
    public static void main(String[] args) {
        PrintThread t1 = new PrintThread("A", 2);
        PrintThread t2 = new PrintThread("B", 1);
        PrintThread t3 = new PrintThread("C", 3);
        PrintThread t4 = new PrintThread("D", 1);
        PrintThread t5 = new PrintThread("E", 2);
        t1.regularRun();
        t2.regularRun();
        t3.regularRun();
        t4.regularRun();
        t5.regularRun();

        System.out.println("**** Start of threads *******");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}