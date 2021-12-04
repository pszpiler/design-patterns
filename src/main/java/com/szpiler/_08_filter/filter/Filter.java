package com.szpiler._08_filter.filter;

import com.szpiler._08_filter.model.Person;

import java.util.List;

public interface Filter {
  List<Person> filter(List<Person> persons);
}
