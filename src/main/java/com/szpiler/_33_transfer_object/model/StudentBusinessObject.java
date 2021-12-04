package com.szpiler._33_transfer_object.model;

import java.util.List;

public class StudentBusinessObject {
  private final List<StudentTransferObject> students;

  public StudentBusinessObject(List<StudentTransferObject> students) {
    this.students = students;
  }

  public List<StudentTransferObject> getAll() {
    return students;
  }

  public StudentTransferObject getById(int id) {
    for (StudentTransferObject studentTransferObject : students) {
      if (studentTransferObject.getId() == id) {
        return studentTransferObject;
      }
    }
    return null;
  }

  public void update(StudentTransferObject studentTransferObject) {
    for (StudentTransferObject s : students) {
      if (s.getId() == studentTransferObject.getId()) {
        s.setName(studentTransferObject.getName());
        return;
      }
    }
    throw new RuntimeException("student not found");
  }
}


