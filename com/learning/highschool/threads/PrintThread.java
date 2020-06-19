package com.learning.highschool.threads;

public class PrintThread extends Thread {
    private String name;
    private int delay;

    public PrintThread(String name, int delay) {
        super();
        this.name = name;
        this.delay = delay;
    }

    public void run() {
        System.out.println("Start of thread - " + name);
        try {
            Thread.sleep(delay * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("End of thread - " + name);

    }

    public void regularRun() {
        System.out.println("Start of thread - " + name);
        try {
            Thread.sleep(delay * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("End of thread - " + name);

    }
}