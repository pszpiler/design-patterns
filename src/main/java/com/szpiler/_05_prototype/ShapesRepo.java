package com.szpiler._05_prototype;

import com.szpiler._05_prototype.model.Circle;
import com.szpiler._05_prototype.model.Rectangle;
import com.szpiler._05_prototype.model.Shape;

import java.util.Hashtable;

class ShapesRepo {
  private final Hashtable<Integer, Shape> shapes = new Hashtable<>();

  void load() {
    Shape shape1 = new Rectangle(1);
    Shape shape2 = new Circle(2);

    shapes.put(shape1.getId(), shape1);
    shapes.put(shape2.getId(), shape2);
  }

  Shape getById(Integer id) {
    Shape shape = shapes.get(id);
    return (Shape) shape.clone(); // smart, fast clone, to cut off from shapes, and avoid heavy operations
  }
}