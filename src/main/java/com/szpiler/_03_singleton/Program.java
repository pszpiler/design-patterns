package com.szpiler._03_singleton;

public class Program {
  public static void main(String[] args) {
    FtpConnector connector1 = FtpConnector.getInstance();
    FtpConnector connector2 = FtpConnector.getInstance();

    connector1.connect();
    connector2.connect();

    System.out.println(connector1);
    System.out.println(connector2);
  }
}
