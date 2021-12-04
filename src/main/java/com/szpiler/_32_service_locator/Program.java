package com.szpiler._32_service_locator;

import com.szpiler._32_service_locator.model.Service;
import com.szpiler._32_service_locator.model.ServiceLocator;
import com.szpiler._32_service_locator.model.ServiceLookup;
import com.szpiler._32_service_locator.model.Serviceache;

public class Program {
  public static void main(String[] args) {
    ServiceLookup serviceLookup = new ServiceLookup();
    Serviceache serviceache = new Serviceache();
    ServiceLocator serviceLocator = new ServiceLocator(serviceLookup, serviceache);

    Service service1 = serviceLocator.getService("service1");
    service1.execute();
    System.out.println("----------------------------");

    Service service2 = serviceLocator.getService("service2");
    service1.execute();
    System.out.println("----------------------------");

    Service service1a = serviceLocator.getService("service1");
    service1a.execute();
    System.out.println("----------------------------");

    Service service2a = serviceLocator.getService("service2");
    service2a.execute();
    System.out.println("----------------------------");
  }
}
