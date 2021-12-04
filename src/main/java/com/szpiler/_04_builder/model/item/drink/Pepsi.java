package com.szpiler._04_builder.model.item.drink;

public class Pepsi extends Drink {
  @Override
  public String getName() {
    return "pepsi";
  }

  @Override
  public float getCost() {
    return 4.5f;
  }
}
