package com.szpiler._04_builder.model.item.drink;

public class Coke extends Drink {
  @Override
  public String getName() {
    return "coke";
  }

  @Override
  public float getCost() {
    return 5.2f;
  }
}
