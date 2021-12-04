package com.szpiler._08_filter.filter;

import com.szpiler._08_filter.model.MartialStatus;
import com.szpiler._08_filter.model.Person;

import java.util.ArrayList;
import java.util.List;

public class SingleMartialStatusFilter implements Filter {
  @Override
  public List<Person> filter(List<Person> persons) {
    List<Person> result = new ArrayList<>();
    for (Person person : persons) {
      if (person.getMartialStatus() == MartialStatus.SINGLE) {
        result.add(person);
      }
    }
    return result;
  }
}
