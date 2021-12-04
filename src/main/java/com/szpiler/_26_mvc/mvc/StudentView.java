package com.szpiler._26_mvc.mvc;

public class StudentView {
  void render(StudentModel model) {
    System.out.println("Student, name: " + model.getName() + " age: " + model.getAge());
  }
}
