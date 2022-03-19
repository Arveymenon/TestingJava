package com.example.demo.threads;

public class MainThread {
    public MainThread(){

        Thread t1 = new Thread(new Thread1());

        t1.run();
        t1.run();

        try {
            t1.wait(4000);
//            t1;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
