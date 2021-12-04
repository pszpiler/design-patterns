package com.szpiler._28_composite_entity;

import com.szpiler._28_composite_entity.model.Client;

public class Program {
  public static void main(String[] args) {
    Client client = new Client();

    client.setData("orange", "apple");
    client.showData();

    System.out.println("-----------------");

    client.setData("aaa", "bbb");
    client.showData();

  }
}
