package com.szpiler._31_intercepting_filter.model;

import com.szpiler._31_intercepting_filter.model.filter.FilterManager;

public class Client {
  private final FilterManager filterManager;

  public Client(FilterManager filterManager) {
    this.filterManager = filterManager;
  }

  public void sendRequest(String request) {
    filterManager.execute(request);
  }
}
