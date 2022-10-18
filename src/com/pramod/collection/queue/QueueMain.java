package com.pramod.collection.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        IntStream.range(0,10).forEach(e ->queue.add(e));
        System.out.println("Queue " + queue);

        int removedElement = queue.remove();
        System.out.println("Removed element " + removedElement);
        System.out.println("Queue " + queue);

        int peekElement = queue.peek();
        System.out.println("Peeked Element " + peekElement);
        System.out.println("Queue " + queue);

        System.out.println("Queue size " + queue.size());

        queue.add(10);
        queue.add(null);
        System.out.println("Queue " + queue);

        List<Integer> list = IntStream.range(20,30).boxed().collect(Collectors.toList());
        queue.addAll(list);
        System.out.println("Queue " + queue);

        System.out.println("Element " + queue.element());


        System.out.println("Poll Element " + queue.poll());
        System.out.println("Queue " + queue);

        IntStream.range(0,10).forEach(e ->queue.add(e));
        System.out.println("Queue " + queue);

        queue.clear();
        System.out.println("Queue " + queue);

        //Not throw an exception when trying to poll element from empty queue.
        //Poll Element null
        System.out.println("Poll Element " + queue.poll());
        System.out.println("Queue " + queue);

        //throw an exception when trying to poll element from empty queue.
        //Exception in thread "main" java.util.NoSuchElementException
        System.out.println("Poll Element " + queue.remove());
        System.out.println("Queue " + queue);
    }
}