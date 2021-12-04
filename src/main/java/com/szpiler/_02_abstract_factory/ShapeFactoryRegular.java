package com.szpiler._02_abstract_factory;

import com.szpiler._02_abstract_factory.model.Rectangle;
import com.szpiler._02_abstract_factory.model.Shape;
import com.szpiler._02_abstract_factory.model.Square;

public class ShapeFactoryRegular implements ShapeFactory {
  @Override
  public Shape create(String name) {
    if (name == null) {
      return null;
    }

    if (name.equalsIgnoreCase("rectangle")) {
      return new Rectangle();
    }

    if (name.equalsIgnoreCase("square")) {
      return new Square();
    }

    return null;
  }
}
