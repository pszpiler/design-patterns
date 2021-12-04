package com.szpiler._15_command.model;

public class Stock {
  private final String name;

  public Stock(String name) {
    this.name = name;
  }

  public void buy() {
    System.out.println("buy " + name);
  }

  public void sell() {
    System.out.println("sell " + name);
  }

  public void incr() {
    System.out.println("incr " + name);
  }
}
