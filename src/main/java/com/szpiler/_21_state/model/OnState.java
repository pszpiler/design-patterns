package com.szpiler._21_state.model;

public class OnState extends State {
  private static State instance;

  static State instance() {
    if (instance == null) {
      instance = new OnState();
    }
    return instance;
  }

  @Override
  public String getName() {
    return "ON";
  }

  @Override
  public void push(Button button) {
    button.setState(OffState.instance());
    System.out.println("change to OFF state");
  }
}
