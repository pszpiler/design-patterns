package com.szpiler._21_state.model;

public class OffState extends State {
  private static State instance;

  static State instance() {
    if (instance == null) {
      instance = new OffState();
    }
    return instance;
  }

  @Override
  public String getName() {
    return "OFF";
  }

  @Override
  public void push(Button button) {
    button.setState(OnState.instance());
    System.out.println("change to ON state");
  }
}
