package com.szpiler._08_filter.filter;

import com.szpiler._08_filter.model.Person;
import com.szpiler._08_filter.model.Sex;

import java.util.ArrayList;
import java.util.List;

public class MaleFilter implements Filter {
  @Override
  public List<Person> filter(List<Person> persons) {
    List<Person> result = new ArrayList<>();
    for (Person person : persons) {
      if (person.getSex() == Sex.MALE) {
        result.add(person);
      }
    }
    return result;
  }
}
