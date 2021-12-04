package com.szpiler._13_proxy;

import com.szpiler._13_proxy.model.Image;
import com.szpiler._13_proxy.model.ProxyImage;

public class Program {
  public static void main(String[] args) {
    Image image = new ProxyImage("some-photo.png");

    image.display();
    System.out.println("----------------");

    image.display();

  }
}
