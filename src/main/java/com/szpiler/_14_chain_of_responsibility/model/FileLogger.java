package com.szpiler._14_chain_of_responsibility.model;

public class FileLogger extends Logger {
  public FileLogger(LogLevel level) {
    super(level);
  }

  @Override
  protected void write(String message) {
    System.out.println("file log message: " + message);
  }
}
