package com.szpiler._13_proxy.model;

public class RealImage implements Image {
  private final String filePath;

  RealImage(String filePath) {
    this.filePath = filePath;
    loadFromDisc();
  }

  @Override
  public void display() {
    System.out.println("display image");
  }

  private void loadFromDisc() {
    System.out.println("load [" + filePath + "] from disc");
  }
}
