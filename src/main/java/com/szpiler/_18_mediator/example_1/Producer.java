package com.szpiler._18_mediator.example_1;

import com.szpiler._18_mediator.example_1.model.Message;

import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
  private final Mediator mediator;

  Producer(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void run() {
    boolean running = true;
    while (running) {
      try {
        Message message = new Message((int) (Math.random() * 100));
        mediator.send(message);
        System.out.println("produce " + Thread.currentThread() + " [ " + message.getRandom() + " ]");
        TimeUnit.MILLISECONDS.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
        running = false;
      }
    }
  }
}
