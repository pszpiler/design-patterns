package com.szpiler._31_intercepting_filter.model.filter;

public class AuthorizationFilter implements Filter {
  @Override
  public void execute(String request) {
    System.out.println("execute authorization filter for request " + request);
  }
}
