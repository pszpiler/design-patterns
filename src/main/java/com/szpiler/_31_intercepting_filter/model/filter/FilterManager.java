package com.szpiler._31_intercepting_filter.model.filter;

import com.szpiler._31_intercepting_filter.model.Target;

public class FilterManager {
  private FilterChain filterChain;

  public FilterManager(Target target) {
    this.filterChain = new FilterChain(target);
  }

  public void addFilter(Filter filter) {
    filterChain.addFilter(filter);
  }

  public void execute(String request) {
    filterChain.execute(request);
  }
}
