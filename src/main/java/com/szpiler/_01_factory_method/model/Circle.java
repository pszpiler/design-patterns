package com.szpiler._01_factory_method.model;

public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("draw circle");
  }
}