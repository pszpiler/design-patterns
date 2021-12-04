package com.szpiler._09_composite.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private final String name;
  private final String position;
  private final int salary;
  private final List<Employee> subordinates = new ArrayList<>();

  public Employee(String name, String position, int salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  public List<Employee> getSubordinates() {
    return subordinates;
  }

  public void add(Employee employee) {
    subordinates.add(employee);
  }

  public void remove(Employee employee) {
    subordinates.remove(employee);
  }

  @Override
  public String toString() {
    return position + ", " + name + ", " + salary;
  }
}
