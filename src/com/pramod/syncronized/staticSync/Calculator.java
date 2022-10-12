package com.pramod.syncronized.staticSync;

public class Calculator implements Runnable {
    private static int sum = 0;

    public synchronized static void sum() {
        sum++;
        System.out.println("New value is " + sum);
    }

    @Override
    public void run() {
        sum();
        System.out.println("Executing  with " + Thread.currentThread().getName() + " => " + sum);
    }
}