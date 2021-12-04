package com.szpiler._08_filter.model;

public class Person {
  private final String name;
  private final Sex sex;
  private final MartialStatus martialStatus;

  public Person(String name, Sex sex, MartialStatus martialStatus) {
    this.name = name;
    this.sex = sex;
    this.martialStatus = martialStatus;
  }

  public String getName() {
    return name;
  }

  public Sex getSex() {
    return sex;
  }

  public MartialStatus getMartialStatus() {
    return martialStatus;
  }
}
