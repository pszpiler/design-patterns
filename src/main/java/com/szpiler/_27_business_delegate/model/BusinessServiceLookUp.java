package com.szpiler._27_business_delegate.model;

import java.util.HashMap;

class BusinessServiceLookUp {
  private final HashMap<String, BusinessService> services = new HashMap<>();

  BusinessServiceLookUp() {
    services.put("JMS", new JmsBusinessService());
    services.put("EJB", new EjbBusinessService());
  }

  BusinessService getBusinessService(String type) {
    if (!services.containsKey(type)) {
      throw new RuntimeException("Service type [" + type + "] not found");
    }
    return services.get(type);
  }
}
