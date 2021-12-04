package com.szpiler._20_observer.model;

public class DecimalObserver extends Observer {
  public DecimalObserver(Subject subject) {
    super(subject);
  }

  @Override
  public void update() {
    System.out.println("decimal\t" + subject.getNumber());
  }
}
