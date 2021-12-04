package com.szpiler._04_builder.model.item.burger;

public class MeatBurger extends Burger {
  @Override
  public String getName() {
    return "meat burger";
  }

  @Override
  public float getCost() {
    return 25.8f;
  }
}
