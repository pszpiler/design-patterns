package com.szpiler._05_prototype.model;

abstract public class Shape implements Cloneable {
  Integer id;

  public Shape(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  abstract public void draw();

  @Override
  public Object clone() {
    Object clone = null;
    try {
      clone = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }
}
