package com.szpiler._31_intercepting_filter.model.filter;

public class DebugFilter implements Filter {
  @Override
  public void execute(String request) {
    System.out.println("execute debug filter for request " + request);
  }
}
