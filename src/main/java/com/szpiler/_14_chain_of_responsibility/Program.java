package com.szpiler._14_chain_of_responsibility;

import com.szpiler._14_chain_of_responsibility.model.Logger;

public class Program {
  public static void main(String[] args) {
    Logger logger = LoggerChainFactory.create();

    logger.error("some error!");
    System.out.println("-------------------");

    logger.info("some info!");
    System.out.println("-------------------");

    logger.debug("some debug!");
    System.out.println("-------------------");

    logger.trace("some trace!");
    System.out.println("-------------------");
  }
}
