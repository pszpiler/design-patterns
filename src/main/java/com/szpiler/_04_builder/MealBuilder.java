package com.szpiler._04_builder;

import com.szpiler._04_builder.model.Meal;
import com.szpiler._04_builder.model.item.burger.MeatBurger;
import com.szpiler._04_builder.model.item.burger.VegBurger;
import com.szpiler._04_builder.model.item.drink.Coke;
import com.szpiler._04_builder.model.item.drink.Pepsi;

class MealBuilder {
  static Meal buildMeatMeal() {
    Meal meal = new Meal();

    meal.addItem(new MeatBurger());
    meal.addItem(new Coke());

    return meal;
  }

  static Meal buildVegMeal() {
    Meal meal = new Meal();

    meal.addItem(new VegBurger());
    meal.addItem(new Pepsi());
    meal.addItem(new Pepsi());

    return meal;
  }
}
