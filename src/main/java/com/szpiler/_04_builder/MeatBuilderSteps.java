package com.szpiler._04_builder;

import com.szpiler._04_builder.model.Meal;
import com.szpiler._04_builder.model.item.Item;

import java.util.ArrayList;
import java.util.List;

class MeatBuilderSteps {
  private final List<Item> items = new ArrayList<>();

  MeatBuilderSteps withItem(Item item) {
    items.add(item);
    return this;
  }

  Meal build() {
    Meal meal = new Meal();

    for (Item item : items) {
      meal.addItem(item);
    }

    return meal;
  }
}
