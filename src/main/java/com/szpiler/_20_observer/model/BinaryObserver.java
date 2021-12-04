package com.szpiler._20_observer.model;

public class BinaryObserver extends Observer {
  public BinaryObserver(Subject subject) {
    super(subject);
  }

  @Override
  public void update() {
    System.out.println("binary\t" + Integer.toBinaryString(subject.getNumber()).toUpperCase());
  }
}
