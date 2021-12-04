package com.szpiler._02_abstract_factory;

import com.szpiler._02_abstract_factory.model.Shape;

public class Program {
  public static void main(String[] args) {
    ShapeFactory shapeFactory1 = MainFactory.create(true);

    Shape shape11 = shapeFactory1.create("rectangle");
    shape11.draw();

    Shape shape12 = shapeFactory1.create("square");
    shape12.draw();

    ShapeFactory shapeFactory2 = MainFactory.create(false);

    Shape shape21 = shapeFactory2.create("rectangle");
    shape21.draw();

    Shape shape22 = shapeFactory2.create("square");
    shape22.draw();
  }
}
