package com.szpiler._02_abstract_factory;

class MainFactory {
  static ShapeFactory create(boolean rounded) {
    if (rounded) {
      return new ShapeFactoryRounded();
    }
    return new ShapeFactoryRegular();
  }
}
