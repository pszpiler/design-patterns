package com.szpiler._10_decorator.model;

public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("rectangle");
  }
}
