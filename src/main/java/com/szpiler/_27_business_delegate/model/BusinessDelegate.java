package com.szpiler._27_business_delegate.model;

public class BusinessDelegate {
  private final BusinessServiceLookUp businessServiceLookUp = new BusinessServiceLookUp();
  private String type = "JMS";

  public void setType(String type) {
    this.type = type;
  }

  void doTask() {
    businessServiceLookUp.getBusinessService(type).doProcessing();
  }
}
