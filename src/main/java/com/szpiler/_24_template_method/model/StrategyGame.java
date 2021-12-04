package com.szpiler._24_template_method.model;

public class StrategyGame extends Game {
  @Override
  protected void init() {
    System.out.println("strategy game init");
  }

  @Override
  protected void start() {
    System.out.println("strategy game start");
  }

  @Override
  protected void stop() {
    System.out.println("strategy game stop");
  }
}
