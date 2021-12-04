package com.szpiler._08_filter.filter;

import com.szpiler._08_filter.model.Person;

import java.util.List;

public class AndFilter implements Filter {
  private final Filter filterA;
  private final Filter filterB;

  public AndFilter(Filter filterA, Filter filterB) {
    this.filterA = filterA;
    this.filterB = filterB;
  }

  @Override
  public List<Person> filter(List<Person> persons) {
    return filterB.filter(filterA.filter(persons));
  }
}
