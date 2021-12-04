package com.szpiler._24_template_method.model;

abstract public class Game {
  public final void play() {
    init();
    start();
    stop();
  }

  abstract protected void init();

  abstract protected void start();

  abstract protected void stop();
}