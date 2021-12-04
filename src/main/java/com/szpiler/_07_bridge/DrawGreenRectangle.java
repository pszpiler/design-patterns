package com.szpiler._07_bridge;

public class DrawGreenRectangle implements DrawApi {
  @Override
  public void draw(int x, int y) {
    System.out.println("green rectangle with dimensions x = " + x + " y = " + y);
  }
}
