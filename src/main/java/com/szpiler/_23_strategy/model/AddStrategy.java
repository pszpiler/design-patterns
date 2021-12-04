package com.szpiler._23_strategy.model;

public class AddStrategy extends Strategy {
  @Override
  public int doOperation(int a, int b) {
    return a + b;
  }
}
