package com.szpiler._13_proxy.model;

public class ProxyImage implements Image {
  private final String filePath;
  private Image realImage;

  public ProxyImage(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(filePath);
    }
    realImage.display();
  }
}
