package com.szpiler._33_transfer_object;

import com.szpiler._33_transfer_object.model.StudentBusinessObject;
import com.szpiler._33_transfer_object.model.StudentTransferObject;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<StudentTransferObject> students = new ArrayList<>();

    students.add(new StudentTransferObject(1, "james bond"));
    students.add(new StudentTransferObject(2, "rocky balboa"));

    StudentBusinessObject studentBusinessObject = new StudentBusinessObject(students);

    show(studentBusinessObject.getAll());

    StudentTransferObject s1 = studentBusinessObject.getById(1);
    System.out.println(s1);

    studentBusinessObject.update(new StudentTransferObject(1, "rambo"));

    show(studentBusinessObject.getAll());
  }

  private static void show(List<StudentTransferObject> students) {
    for (StudentTransferObject studentTransferObject : students) {
      System.out.println("id = " + studentTransferObject.getId() + " name = " + studentTransferObject.getName());
    }
    System.out.println("------------------------");
  }
}
