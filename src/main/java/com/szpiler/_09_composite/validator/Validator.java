package com.szpiler._09_composite.validator;

import com.szpiler._09_composite.model.Item;

import java.util.ArrayList;
import java.util.List;

abstract public class Validator {
  private final List<Validator> validators = new ArrayList<>();

  public void add(Validator validator) {
    validators.add(validator);
  }

  public void validate(Item item) {
    check(item);
    for (Validator validator : validators) {
      validator.validate(item);
    }
  }

  protected abstract void check(Item item);
}
