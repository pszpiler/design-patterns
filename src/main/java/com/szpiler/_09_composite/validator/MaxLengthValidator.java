package com.szpiler._09_composite.validator;

import com.szpiler._09_composite.model.Item;

public class MaxLengthValidator extends Validator {
  private final int maxLength;

  public MaxLengthValidator(int maxLength) {
    this.maxLength = maxLength;
  }

  @Override
  protected void check(Item item) {
    if (item.getName().length() > maxLength) {
      throw new RuntimeException("Item name should have maximum [" + maxLength + "] characters.");
    }
  }
}
