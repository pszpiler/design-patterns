package com.szpiler._18_mediator.example_1;

import com.szpiler._18_mediator.example_1.model.Message;

import java.util.Stack;

class Mediator {
  private final Stack<Message> messages = new Stack<>();

  synchronized void send(Message message) {
    messages.push(message);
    notifyAll();
  }

  synchronized Message receive() throws InterruptedException {
    wait();
    return messages.pop();
  }
}
