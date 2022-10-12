package com.pramod.syncronized.syncronizedmethod;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class MultiThreadSynchronized {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        ExecutorService service = Executors.newFixedThreadPool(3);
        IntStream.range(0, 1000).forEach(c -> service.submit(cal));
    }
}
