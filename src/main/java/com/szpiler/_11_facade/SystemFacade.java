package com.szpiler._11_facade;

import com.szpiler._11_facade.model.Circle;
import com.szpiler._11_facade.model.Rectangle;
import com.szpiler._11_facade.model.Shape;

class SystemFacade {
  private final Shape rectangle = new Rectangle();
  private final Shape circle = new Circle();

  void drawRectangle() {
    rectangle.draw();
  }

  void drawCircle() {
    circle.draw();
  }
}
