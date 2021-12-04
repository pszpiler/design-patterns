package com.szpiler._32_service_locator.model;

import java.util.ArrayList;
import java.util.List;

public class Serviceache {
  private final List<Service> cache = new ArrayList<>();

  void put(Service service) {
    boolean exists = false;
    for (Service s : cache) {
      if (s.getName().equalsIgnoreCase(service.getName())) {
        exists = true;
        break;
      }
    }
    if (!exists) {
      cache.add(service);
    }
  }

  Service get(String serviceName) {
    for (Service service : cache) {
      if (service.getName().equalsIgnoreCase(serviceName)) {
        return service;
      }
    }
    return null;
  }
}
