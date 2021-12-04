package com.szpiler._28_composite_entity.model;

public class Client {
  private final CompositeEntity compositeEntity = new CompositeEntity();

  public void setData(String data1, String data2) {
    compositeEntity.setData(data1, data2);
  }

  public void showData() {
    for (String data : compositeEntity.getData()) {
      System.out.println(data);
    }
  }
}
