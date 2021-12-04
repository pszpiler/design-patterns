package com.szpiler._02_abstract_factory.model;

public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("draw rectangle");
  }
}
