package com.szpiler._32_service_locator.model;

public class ServiceLocator {
  private final ServiceLookup serviceLookup;
  private final Serviceache cache;

  public ServiceLocator(ServiceLookup serviceLookup, Serviceache cache) {
    this.serviceLookup = serviceLookup;
    this.cache = cache;
  }

  public Service getService(String serviceName) {
    Service service = cache.get(serviceName);

    if (service == null) {
      System.out.println("cache was empty for service " + serviceName + " lookup");
      service = serviceLookup.lookup(serviceName);
      cache.put(service);
    } else {
      System.out.println("return service " + serviceName + " from cache");
    }

    return service;
  }
}
