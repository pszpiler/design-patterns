package com.szpiler._21_state.model;

abstract public class State {
  abstract public String getName();
  abstract public void push(Button button);
}
