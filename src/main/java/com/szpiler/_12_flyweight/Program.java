package com.szpiler._12_flyweight;

import com.szpiler._12_flyweight.model.Circle;

public class Program {
  private static final String[] colors = {"red", "green", "yellow", "blue", "orange"};

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    System.out.println("circles counter = " + Circle.counter);
    System.out.println("----------------------------------");

    for (int i = 0; i < 20; i++) {
      Circle circle = (Circle) shapeFactory.getCircle(getRandomColor());
      circle.setX(getRandomX());
      circle.setY(getRandomY());
      circle.setRadius(50);
      circle.draw();
    }

    System.out.println("----------------------------------");
    System.out.println("circles counter = " + Circle.counter);
  }

  private static String getRandomColor() {
    return colors[(int) (Math.random() * colors.length)];
  }

  private static int getRandomX() {
    return (int) (Math.random() * 100);
  }

  private static int getRandomY() {
    return (int) (Math.random() * 200);
  }
}