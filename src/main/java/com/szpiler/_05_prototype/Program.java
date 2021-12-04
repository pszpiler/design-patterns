package com.szpiler._05_prototype;

import com.szpiler._05_prototype.model.Shape;

public class Program {
  public static void main(String[] args) {
    ShapesRepo shapesRepo = new ShapesRepo();

    shapesRepo.load(); // heavy operation

    Shape shape1 = shapesRepo.getById(1); // cut off objects, clones with the same values
    Shape shape2 = shapesRepo.getById(2);
    Shape shape3 = shapesRepo.getById(1);

    shape1.draw();
    shape2.draw();
    shape3.draw();

    System.out.println(shape1);
    System.out.println(shape2);
    System.out.println(shape3);
  }
}
