package com.szpiler._05_prototype.model;

public class Circle extends Shape {
  public Circle(Integer id) {
    super(id);
  }

  @Override
  public void draw() {
    System.out.println("circle, id = " + id);
  }
}
