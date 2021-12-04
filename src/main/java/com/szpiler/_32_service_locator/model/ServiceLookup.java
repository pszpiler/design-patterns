package com.szpiler._32_service_locator.model;

public class ServiceLookup {
  Service lookup(String serviceName) {
    if (serviceName.equalsIgnoreCase("service1")) {
      System.out.println("lookup service1");
      return new Service1();
    }
    if (serviceName.equalsIgnoreCase("service2")) {
      System.out.println("lookup service2");
      return new Service2();
    }
    return null;
  }
}
