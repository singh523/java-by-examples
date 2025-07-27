package com.example.challenges.producerconsumer;

public class Consumer implements Runnable{

    private final DataQueue dataQueue;
    private boolean isRunning = false;
    public Consumer(DataQueue dataQueue){
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        try {
            consume();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void consume() throws InterruptedException {
        while(isRunning){
            if(dataQueue.isEmpty()){
                try {
                    dataQueue.waitIsNotEmpty();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(!isRunning) break;
            Message message = dataQueue.remove();
            System.out.println(message);
        }
    }
}
