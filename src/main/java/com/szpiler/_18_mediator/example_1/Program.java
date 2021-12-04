package com.szpiler._18_mediator.example_1;

public class Program {
  public static void main(String[] args) throws InterruptedException {
    Mediator mediator = new Mediator();

    Consumer consumer1 = new Consumer(mediator);
    Consumer consumer2 = new Consumer(mediator);
    Producer producer = new Producer(mediator);

    Thread consumerThread1 = new Thread(consumer1);
    Thread consumerThread2 = new Thread(consumer2);
    Thread producerThread = new Thread(producer);

    consumerThread1.start();
    consumerThread2.start();
    producerThread.start();

    consumerThread1.join();
    consumerThread2.join();
    producerThread.join();
  }
}
