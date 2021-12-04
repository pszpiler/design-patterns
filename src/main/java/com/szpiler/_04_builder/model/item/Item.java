package com.szpiler._04_builder.model.item;

import com.szpiler._04_builder.model.pack.Package;

public interface Item {
  String getName();

  float getCost();

  Package getPackage();
}
