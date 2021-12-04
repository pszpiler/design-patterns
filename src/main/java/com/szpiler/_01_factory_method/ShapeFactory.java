package com.szpiler._01_factory_method;

import com.szpiler._01_factory_method.model.Circle;
import com.szpiler._01_factory_method.model.Rectangle;
import com.szpiler._01_factory_method.model.Shape;

class ShapeFactory {
  Shape create(String name) {
    if (name == null) {
      return null;
    }

    if (name.equalsIgnoreCase("rectangle")) {
      return new Rectangle();
    }

    if (name.equalsIgnoreCase("circle")) {
      return new Circle();
    }

    return null;
  }
}
