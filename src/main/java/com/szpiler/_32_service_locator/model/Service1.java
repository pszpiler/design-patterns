package com.szpiler._32_service_locator.model;

public class Service1 implements Service {
  @Override
  public String getName() {
    return "service1";
  }

  @Override
  public void execute() {
    System.out.println("execute " + getName());
  }
}
