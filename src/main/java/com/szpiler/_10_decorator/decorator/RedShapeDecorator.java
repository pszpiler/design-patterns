package com.szpiler._10_decorator.decorator;

import com.szpiler._10_decorator.model.Shape;

public class RedShapeDecorator extends ShapeDecorator {
  public RedShapeDecorator(Shape decoratedShape) {
    super(decoratedShape);
  }

  @Override
  public void draw() {
    decoratedShape.draw();
    setBorder();
  }

  private void setBorder() {
    System.out.println("set red border");
  }
}
