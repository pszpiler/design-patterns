package com.szpiler._20_observer.model;

public class HexObserver extends Observer {
  public HexObserver(Subject subject) {
    super(subject);
  }

  @Override
  public void update() {
    System.out.println("hex\t " + Integer.toHexString(subject.getNumber()).toUpperCase());
  }
}
