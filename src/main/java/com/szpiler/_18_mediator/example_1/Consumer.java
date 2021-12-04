package com.szpiler._18_mediator.example_1;

import com.szpiler._18_mediator.example_1.model.Message;

public class Consumer implements Runnable {
  private final Mediator mediator;

  Consumer(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void run() {
    boolean running = true;
    while (running) {
      try {
        Message message = mediator.receive();
        System.out.println("consumer " + Thread.currentThread() + " [ " + message.getRandom() + " ]");
        System.out.println("------------------------------------------");
      } catch (InterruptedException e) {
        e.printStackTrace();
        running = false;
      }
    }
  }
}
