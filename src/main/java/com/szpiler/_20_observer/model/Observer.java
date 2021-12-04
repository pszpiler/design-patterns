package com.szpiler._20_observer.model;

abstract public class Observer {
  protected final Subject subject;

  public Observer(Subject subject) {
    this.subject = subject;
    subject.attach(this);
  }

  public abstract void update();
}
