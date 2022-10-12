package com.pramod.syncronized.nonsyncronized;

public class Calculator implements Runnable {
    private int sum = 0;

    public void sum() {
        sum++;
        System.out.println("New value is " + sum);
    }

    @Override
    public void run() {
        sum();
        System.out.println("Executing  with " + Thread.currentThread().getName() + " => " + sum);

    }
}