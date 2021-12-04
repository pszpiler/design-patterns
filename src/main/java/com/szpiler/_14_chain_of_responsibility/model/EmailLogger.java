package com.szpiler._14_chain_of_responsibility.model;

public class EmailLogger extends Logger {
  public EmailLogger(LogLevel level) {
    super(level);
  }

  @Override
  protected void write(String message) {
    System.out.println("email log message: " + message);
  }
}
