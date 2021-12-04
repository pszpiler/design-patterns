package com.szpiler._07_bridge;

public class DrawRedRectangle implements DrawApi {
  @Override
  public void draw(int x, int y) {
    System.out.println("red rectangle with dimensions x = " + x + " y = " + y);
  }
}
