package com.szpiler._02_abstract_factory;

import com.szpiler._02_abstract_factory.model.RectangleRounded;
import com.szpiler._02_abstract_factory.model.Shape;
import com.szpiler._02_abstract_factory.model.SquareRounded;

public class ShapeFactoryRounded implements ShapeFactory {
  @Override
  public Shape create(String name) {
    if (name == null) {
      return null;
    }

    if (name.equalsIgnoreCase("rectangle")) {
      return new RectangleRounded();
    }

    if (name.equalsIgnoreCase("square")) {
      return new SquareRounded();
    }

    return null;
  }
}
