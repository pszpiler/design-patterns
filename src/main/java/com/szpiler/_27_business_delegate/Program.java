package com.szpiler._27_business_delegate;

import com.szpiler._27_business_delegate.model.BusinessDelegate;
import com.szpiler._27_business_delegate.model.Client;

public class Program {
  public static void main(String[] args) {
    BusinessDelegate businessDelegate = new BusinessDelegate();
    Client client = new Client(businessDelegate);

    businessDelegate.setType("JMS");
    client.doTask();

    System.out.println("--------------------");

    businessDelegate.setType("EJB");
    client.doTask();

    System.out.println("--------------------");

    businessDelegate.setType("JMS");
    client.doTask();
  }
}
