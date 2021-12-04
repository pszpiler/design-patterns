package com.szpiler._24_template_method.model;

public class SoccerGame extends Game {
  @Override
  protected void init() {
    System.out.println("soccer game init");
  }

  @Override
  protected void start() {
    System.out.println("soccer game start");
  }

  @Override
  protected void stop() {
    System.out.println("soccer game stop");
  }
}
