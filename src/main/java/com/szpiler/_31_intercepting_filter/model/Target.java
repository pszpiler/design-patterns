package com.szpiler._31_intercepting_filter.model;

public class Target {
  public void execute(String request) {
    System.out.println("execute target on request " + request);
  }
}
