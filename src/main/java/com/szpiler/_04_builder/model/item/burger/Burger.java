package com.szpiler._04_builder.model.item.burger;

import com.szpiler._04_builder.model.item.Item;
import com.szpiler._04_builder.model.pack.Package;
import com.szpiler._04_builder.model.pack.Wrapper;

abstract public class Burger implements Item {
  @Override
  public Package getPackage() {
    return new Wrapper();
  }
}
