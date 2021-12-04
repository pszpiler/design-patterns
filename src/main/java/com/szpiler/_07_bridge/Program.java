package com.szpiler._07_bridge;

import com.szpiler._07_bridge.model.Rectangle;
import com.szpiler._07_bridge.model.Shape;

public class Program {
  public static void main(String[] args) {
    Shape shape1 = new Rectangle(10, 20, new DrawGreenRectangle());
    Shape shape2 = new Rectangle(5, 12, new DrawRedRectangle());

    shape1.draw();
    shape2.draw();

    // save(user)

  }
}
