package com.szpiler._04_builder.model.item.drink;

import com.szpiler._04_builder.model.item.Item;
import com.szpiler._04_builder.model.pack.Bottle;
import com.szpiler._04_builder.model.pack.Package;

abstract public class Drink implements Item {
  @Override
  public Package getPackage() {
    return new Bottle();
  }
}
