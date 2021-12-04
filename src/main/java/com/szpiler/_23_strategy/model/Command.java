package com.szpiler._23_strategy.model;

public class Command {
  private final Strategy strategy;

  public Command(Strategy strategy) {
    this.strategy = strategy;
  }

  public int execute(int a, int b) {
    return strategy.doOperation(a, b);
  }
}
