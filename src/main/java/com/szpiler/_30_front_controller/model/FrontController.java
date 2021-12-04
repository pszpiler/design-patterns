package com.szpiler._30_front_controller.model;

public class FrontController {
  private final Dispatcher dispatcher = new Dispatcher();

  public void handle(String request) {
    logRequest(request);

    if (isAuthorized(request)) {
      dispatcher.dispatch(request);
    } else {
      throw new RuntimeException("request " + request + " not authorized");
    }
  }

  private void logRequest(String request) {
    System.out.println("log " + request);
  }

  private boolean isAuthorized(String request) {
    return true;
  }
}
