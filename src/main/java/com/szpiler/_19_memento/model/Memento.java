package com.szpiler._19_memento.model;

class Memento {
  private final String state;

  Memento(String state) {
    this.state = state;
  }

  String getState() {
    return state;
  }
}
