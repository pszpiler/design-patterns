package com.szpiler._20_observer.model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
  private final List<Observer> observers = new ArrayList<>();

  private int number;

  public Subject(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
    notifyObservers();
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }

  private void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }
}