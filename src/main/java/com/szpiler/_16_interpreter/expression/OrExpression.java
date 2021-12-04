package com.szpiler._16_interpreter.expression;

public class OrExpression implements AbstractExpression {
  private final AbstractExpression expression1;
  private final AbstractExpression expression2;

  public OrExpression(AbstractExpression expression1, AbstractExpression expression2) {
    this.expression1 = expression1;
    this.expression2 = expression2;
  }

  @Override
  public boolean interpret(String context) {
    return expression1.interpret(context) || expression2.interpret(context);
  }
}
