package com.szpiler._12_flyweight;

import com.szpiler._12_flyweight.model.Circle;
import com.szpiler._12_flyweight.model.Shape;

import java.util.HashMap;

class ShapeFactory {
  private final HashMap<String, Shape> shapes = new HashMap<>();

  Shape getCircle(String color) {
    Shape shape = shapes.get(color);
    if (shape == null) {
      shape = new Circle(color);
      shapes.put(color, shape);
    }
    return shape;
  }
}