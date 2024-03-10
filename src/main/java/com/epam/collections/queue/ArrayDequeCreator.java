package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(firstQueue.poll());
        deque.addLast(firstQueue.poll());
        deque.addLast(secondQueue.poll());
        deque.addLast(secondQueue.poll());
        while (!secondQueue.isEmpty()) {
            firstQueue.add(deque.pollFirst());
            deque.addFirst(firstQueue.poll());
            if(!firstQueue.isEmpty())
                deque.addFirst(firstQueue.poll());
            secondQueue.add(deque.pollFirst());
            deque.addFirst(secondQueue.poll());
            if(!secondQueue.isEmpty())
                deque.addFirst(secondQueue.poll());
        }
        return deque;
    }
}
