package com.szpiler._22_null.model;

public class NullCustomer extends Customer {
  @Override
  public String getName() {
    return "EMPTY NAME";
  }

  @Override
  public boolean isNull() {
    return true;
  }
}
