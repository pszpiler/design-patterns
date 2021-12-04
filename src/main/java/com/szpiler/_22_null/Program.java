package com.szpiler._22_null;

import com.szpiler._22_null.model.CustomerRepository;

public class Program {
  public static void main(String[] args) {
    CustomerRepository customerRepository = new CustomerRepository();

    System.out.println(customerRepository.getByName("asia").getName());
    System.out.println(customerRepository.getByName("james").getName());
    System.out.println(customerRepository.getByName("sonia").getName());
    System.out.println(customerRepository.getByName("janek").getName());
    System.out.println(customerRepository.getByName("bob").getName());

  }
}
