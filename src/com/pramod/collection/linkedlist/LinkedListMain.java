package com.pramod.collection.linkedlist;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        IntStream.range(0,10).forEach(e -> linkedList.add(e));
        System.out.println("Linked list " + linkedList);

        linkedList.add(null);
        System.out.println("Linked list " + linkedList);

        linkedList.addFirst(11);
        System.out.println("Linked list " + linkedList);

        linkedList.add(2, 12);
        System.out.println("Linked list " + linkedList);

        linkedList.addLast(100);
        System.out.println("Linked list " + linkedList);

        System.out.println("Elements " + linkedList.element());

        System.out.println("First element " + linkedList.getFirst());

        System.out.println("Last element " + linkedList.getLast());

        linkedList.remove();
        System.out.println("Linked list " + linkedList);

        linkedList.remove(null);
        System.out.println("Linked list " + linkedList);

        linkedList.remove(2);
        System.out.println("Linked list " + linkedList);

        System.out.println("Offer " + linkedList.offer(1));
        System.out.println("Linked list " + linkedList);

        linkedList.offerFirst(200);
        linkedList.offerLast(300);
        System.out.println("Linked list "  + linkedList);

        System.out.println("Peek " + linkedList.peek());
        System.out.println("Linked list " + linkedList);

        System.out.println("Peek first " + linkedList.peekFirst());
        System.out.println("Peek last " + linkedList.peekLast());
        System.out.println("Linked list " + linkedList);

        System.out.println("Poll " + linkedList.poll());
        System.out.println("Linked list " + linkedList);
        System.out.println("Poll First " + linkedList.pollFirst());
        System.out.println("Linked list " + linkedList);
        System.out.println("Poll Last " + linkedList.pollLast());
        System.out.println("Linked list " + linkedList);

        linkedList.set(0, 120);
        System.out.println("Linked list " + linkedList);

        linkedList.stream().peek(System.out::println).collect(Collectors.toList());
    }
}
