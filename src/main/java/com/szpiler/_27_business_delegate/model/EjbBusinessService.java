package com.szpiler._27_business_delegate.model;

public class EjbBusinessService implements BusinessService {
  @Override
  public void doProcessing() {
    System.out.println("EJB processing");
  }
}
