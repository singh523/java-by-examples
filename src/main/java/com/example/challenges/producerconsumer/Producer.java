package com.example.challenges.producerconsumer;

import java.util.Random;

public class Producer implements Runnable{

    private final DataQueue dataQueue;
    private boolean isRunning = false;

    public Producer(DataQueue dataQueue){
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        isRunning = true;
        try {
            produce();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void produce() throws InterruptedException {
        while(isRunning){
            if(dataQueue.isFull()){
                try {
                    dataQueue.waitIsNotFull();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(!isRunning){
                break;
            }
            dataQueue.add(produceMessage());
        }
    }

    private Message produceMessage(){
        Message message = new Message(new Random().nextInt(), new Random().nextDouble());
        System.out.println("Produce Message: " + message);
        return message;
    }
}
