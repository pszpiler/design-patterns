package com.szpiler._04_builder.model.item.burger;

public class VegBurger extends Burger {
  @Override
  public String getName() {
    return "veg burger";
  }

  @Override
  public float getCost() {
    return 10.5f;
  }
}
