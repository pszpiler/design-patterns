package com.szpiler._09_composite.validator;

import com.szpiler._09_composite.model.Item;

public class ItemValidator extends Validator {
  @Override
  protected void check(Item item) {
    if (item == null) {
      throw new RuntimeException("Item cannot be null");
    }
  }
}
