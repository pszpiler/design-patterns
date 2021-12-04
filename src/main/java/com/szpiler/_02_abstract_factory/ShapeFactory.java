package com.szpiler._02_abstract_factory;

import com.szpiler._02_abstract_factory.model.Shape;

public interface ShapeFactory {
  Shape create(String name);
}
