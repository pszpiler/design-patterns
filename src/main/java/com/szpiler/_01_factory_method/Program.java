package com.szpiler._01_factory_method;

import com.szpiler._01_factory_method.model.Shape;

public class Program {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape shape1 = shapeFactory.create("rectangle");
    shape1.draw();

    Shape shape2 = shapeFactory.create("circle");
    shape2.draw();
  }
}