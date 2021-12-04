package com.szpiler._32_service_locator.model;

public class Service2 implements Service {
  @Override
  public String getName() {
    return "service2";
  }

  @Override
  public void execute() {
    System.out.println("execute " + getName());
  }
}
