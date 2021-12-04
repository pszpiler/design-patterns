package com.szpiler._07_bridge.model;

import com.szpiler._07_bridge.DrawApi;

public class Rectangle extends Shape {
  private int x;
  private int y;

  public Rectangle(int x, int y, DrawApi drawApi) {
    super(drawApi);
    this.x = x;
    this.y = y;
  }

  @Override
  public void draw() {
    drawApi.draw(x, y);
  }
}
