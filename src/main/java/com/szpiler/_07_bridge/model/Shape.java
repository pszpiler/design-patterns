package com.szpiler._07_bridge.model;

import com.szpiler._07_bridge.DrawApi;

abstract public class Shape {
  DrawApi drawApi;

  public Shape(DrawApi drawApi) {
    this.drawApi = drawApi;
  }

  public abstract void draw();
}