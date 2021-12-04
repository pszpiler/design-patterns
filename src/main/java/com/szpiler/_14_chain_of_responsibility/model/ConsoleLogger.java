package com.szpiler._14_chain_of_responsibility.model;

public class ConsoleLogger extends Logger {
  public ConsoleLogger(LogLevel level) {
    super(level);
  }

  @Override
  protected void write(String message) {
    System.out.println("console log message: " + message);
  }
}
