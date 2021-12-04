package com.szpiler._14_chain_of_responsibility;

import com.szpiler._14_chain_of_responsibility.model.*;

class LoggerChainFactory {
  static Logger create() {
    Logger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
    Logger fileLogger = new FileLogger(LogLevel.INFO);
    Logger emailLogger = new EmailLogger(LogLevel.ERROR);

    consoleLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(emailLogger);

    return consoleLogger;
  }
}