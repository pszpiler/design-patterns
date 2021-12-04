package com.szpiler._14_chain_of_responsibility.model;

public enum LogLevel {
  TRACE(0),
  DEBUG(1),
  INFO(2),
  ERROR(3);

  public final int number;

  LogLevel(int number) {
    this.number = number;
  }
}
