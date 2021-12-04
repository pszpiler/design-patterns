package com.szpiler._26_mvc.mvc;

public class Controller {
  private final StudentModel model;
  private final StudentView view;

  public Controller(StudentModel model, StudentView view) {
    this.model = model;
    this.view = view;
  }

  public void setStudentName(String name) {
    model.setName(name);
  }

  public void setStudentAge(int age) {
    model.setAge(age);
  }

  public void renderView() {
    view.render(model);
  }
}