package com.szpiler._10_decorator.model;

public class Item {
  private final int id;
  private final String name;

  public Item(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Item{" +
      "id=" + id +
      ", name='" + name + '\'' +
      '}';
  }
}

