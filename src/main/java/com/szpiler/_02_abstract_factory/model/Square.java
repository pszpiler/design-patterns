package com.szpiler._02_abstract_factory.model;

public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("draw square");
  }
}