package com.example.challenges.producerconsumer;

public class ProducerConsumer {

    public static void main(String[] args) {
        DataQueue dataQueue = new DataQueue(4);

        Producer producer = new Producer(dataQueue);
        Thread producerThread = new Thread(producer);

        Consumer consumer = new Consumer(dataQueue);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
