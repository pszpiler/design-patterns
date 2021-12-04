package com.szpiler._20_observer.model;

public class OctalObserver extends Observer {
  public OctalObserver(Subject subject) {
    super(subject);
  }

  @Override
  public void update() {
    System.out.println("octal\t " + Integer.toOctalString(subject.getNumber()).toUpperCase());
  }
}