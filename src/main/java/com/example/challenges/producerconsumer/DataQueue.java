package com.example.challenges.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class DataQueue {

    private int maxSize;
    private Queue<Message> queue = new LinkedList<>();

    private final Object IS_NOT_FULL = new Object();
    private final Object IS_NOT_EMPTY = new Object();

    public DataQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    public void waitIsNotFull() throws InterruptedException {
        synchronized (IS_NOT_FULL) {
                IS_NOT_FULL.wait();
        }
    }

    public void notifyIsNotFull() throws InterruptedException{
        synchronized (IS_NOT_FULL) {
            IS_NOT_FULL.notify();
        }
    }

    public void waitIsNotEmpty() throws InterruptedException {
        synchronized (IS_NOT_EMPTY) {
            IS_NOT_EMPTY.wait();
        }
    }

    public void notifyIsNotEmpty() throws InterruptedException{
        synchronized (IS_NOT_EMPTY) {
            IS_NOT_EMPTY.notify();
        }
    }

    public void add(Message message) throws InterruptedException {

        queue.add(message);
        System.out.println("Message added:" + message);
        notifyIsNotEmpty();
    }
    public Message remove() throws InterruptedException {
        Message message = queue.poll();
        System.out.println("Message removed:" + message);
        notifyIsNotFull();
        return message;
    }

    public boolean isFull(){
        return queue.size() == maxSize;
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }

}
