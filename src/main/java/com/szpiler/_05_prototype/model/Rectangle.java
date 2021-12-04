package com.szpiler._05_prototype.model;

public class Rectangle extends Shape {
  public Rectangle(Integer id) {
    super(id);
  }

  @Override
  public void draw() {
    System.out.println("rectangle, id = " + id);
  }
}
