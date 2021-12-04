package com.szpiler._09_composite.validator;

import com.szpiler._09_composite.model.Item;

public class MinLengthValidator extends Validator {
  private final int minLength;

  public MinLengthValidator(int minLength) {
    this.minLength = minLength;
  }

  @Override
  protected void check(Item item) {
    if (item.getName().length() < minLength) {
      throw new RuntimeException("Item name should have at least [" + minLength + "] characters.");
    }
  }
}
