package com.szpiler._10_decorator.model;

public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("circle");
  }
}
