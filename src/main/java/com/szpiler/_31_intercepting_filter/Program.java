package com.szpiler._31_intercepting_filter;

import com.szpiler._31_intercepting_filter.model.Client;
import com.szpiler._31_intercepting_filter.model.Target;
import com.szpiler._31_intercepting_filter.model.filter.AuthorizationFilter;
import com.szpiler._31_intercepting_filter.model.filter.DebugFilter;
import com.szpiler._31_intercepting_filter.model.filter.FilterManager;

public class Program {
  public static void main(String[] args) {
    Target target = new Target();

    FilterManager filterManager = new FilterManager(target);

    filterManager.addFilter(new AuthorizationFilter());
    filterManager.addFilter(new DebugFilter());

    Client client = new Client(filterManager);

    client.sendRequest("HOME");
  }
}
