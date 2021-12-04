package com.szpiler._24_template_method.model;

public class VideoGame extends Game {
  @Override
  protected void init() {
    System.out.println("video game init");
  }

  @Override
  protected void start() {
    System.out.println("video game start");
  }

  @Override
  protected void stop() {
    System.out.println("video game stop");
  }
}
