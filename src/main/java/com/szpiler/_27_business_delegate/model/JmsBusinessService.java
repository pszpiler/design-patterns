package com.szpiler._27_business_delegate.model;

public class JmsBusinessService implements BusinessService {
  @Override
  public void doProcessing() {
    System.out.println("JMS processing");
  }
}
