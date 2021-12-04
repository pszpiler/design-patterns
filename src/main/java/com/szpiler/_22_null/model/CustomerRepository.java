package com.szpiler._22_null.model;

public class CustomerRepository {
  public Customer getByName(String name) {
    if (name.equalsIgnoreCase("janek")) {
      return new RealCustomer(name);
    }
    if (name.equalsIgnoreCase("asia")) {
      return new RealCustomer(name);
    }
    if (name.equalsIgnoreCase("sonia")) {
      return new RealCustomer(name);
    }
    return new NullCustomer();
  }
}
