package com.szpiler._03_singleton;

class FtpConnector {
  private static FtpConnector instance;

  private FtpConnector() {
    System.out.println("FtpConnector.constructor()");
  }

  static FtpConnector getInstance() {
    if (instance == null) {
      instance = new FtpConnector();
    }
    return instance;
  }

  void connect() {
    System.out.println("FtpConnector.connect()");
  }
}
