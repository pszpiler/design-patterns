package com.szpiler._31_intercepting_filter.model.filter;

import com.szpiler._31_intercepting_filter.model.Target;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
  private final List<Filter> filters = new ArrayList<>();
  private final Target target;

  FilterChain(Target target) {
    this.target = target;
  }

  public void execute(String request) {
    for (Filter filter : filters) {
      filter.execute(request);
    }
    target.execute(request);
  }

  void addFilter(Filter filter) {
    filters.add(filter);
  }
}
