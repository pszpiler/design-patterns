package com.szpiler._08_filter.filter;

import com.szpiler._08_filter.model.Person;

import java.util.List;

public class OrFilter implements Filter {
  private final Filter filterA;
  private final Filter filterB;

  public OrFilter(Filter filterA, Filter filterB) {
    this.filterA = filterA;
    this.filterB = filterB;
  }

  @Override
  public List<Person> filter(List<Person> persons) {
    List<Person> resultA = filterA.filter(persons);
    List<Person> resultB = filterB.filter(persons);
    resultA.addAll(resultB);
    return resultA;
  }
}