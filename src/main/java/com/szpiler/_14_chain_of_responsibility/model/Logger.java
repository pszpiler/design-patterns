package com.szpiler._14_chain_of_responsibility.model;

abstract public class Logger {
  private final LogLevel level;
  private Logger nextLogger;

  Logger(LogLevel level) {
    this.level = level;
  }

  public void trace(String message) {
    log(LogLevel.TRACE, message);
  }

  public void debug(String message) {
    log(LogLevel.DEBUG, message);
  }

  public void info(String message) {
    log(LogLevel.INFO, message);
  }

  public void error(String message) {
    log(LogLevel.ERROR, message);
  }

  public void setNextLogger(Logger nextLogger) {
    this.nextLogger = nextLogger;
  }

  abstract protected void write(String message);

  private void log(LogLevel logLevel, String message) {
    if (level.number <= logLevel.number) {
      write(message);
    }

    if (nextLogger != null) {
      nextLogger.log(logLevel, message);
    }
  }
}
