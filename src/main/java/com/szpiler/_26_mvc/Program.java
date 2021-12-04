package com.szpiler._26_mvc;

import com.szpiler._26_mvc.mvc.Controller;
import com.szpiler._26_mvc.mvc.StudentModel;
import com.szpiler._26_mvc.mvc.StudentView;

public class Program {
  public static void main(String[] args) {
    StudentModel model = getStudentFromDatabase();
    StudentView view = new StudentView();

    Controller controller = new Controller(model, view);

    controller.renderView();
    System.out.println("--------------------");

    controller.setStudentName("Kate");
    controller.renderView();
    System.out.println("--------------------");

    controller.setStudentAge(29);
    controller.renderView();
    System.out.println("--------------------");
  }

  private static StudentModel getStudentFromDatabase() {
    return new StudentModel("Amy", 30);
  }
}