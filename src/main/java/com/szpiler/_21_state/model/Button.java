package com.szpiler._21_state.model;

public class Button {
  private State state = OffState.instance();

  public State getState() {
    return state;
  }

  void setState(State state) {
    this.state = state;
  }

  public void push() {
    state.push(this);
  }
}
