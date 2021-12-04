package com.szpiler._30_front_controller;

import com.szpiler._30_front_controller.model.FrontController;

public class Program {
  public static void main(String[] args) {
    FrontController frontController = new FrontController();

    frontController.handle("student");
    System.out.println("----------------------------");

    frontController.handle("home");
    System.out.println("----------------------------");

    frontController.handle("xyy");
    System.out.println("----------------------------");
  }
}
