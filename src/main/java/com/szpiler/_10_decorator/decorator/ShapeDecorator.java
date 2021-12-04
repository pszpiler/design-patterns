package com.szpiler._10_decorator.decorator;

import com.szpiler._10_decorator.model.Shape;

abstract class ShapeDecorator implements Shape {
  final Shape decoratedShape;

  ShapeDecorator(Shape decoratedShape) {
    this.decoratedShape = decoratedShape;
  }
}
