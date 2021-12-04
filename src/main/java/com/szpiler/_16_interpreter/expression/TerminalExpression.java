package com.szpiler._16_interpreter.expression;

public class TerminalExpression implements AbstractExpression {
  private final String needle;

  public TerminalExpression(String needle) {
    this.needle = needle;
  }

  @Override
  public boolean interpret(String context) {
    return context.contains(needle);
  }
}
