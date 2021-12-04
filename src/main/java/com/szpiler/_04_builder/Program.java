package com.szpiler._04_builder;

import com.szpiler._04_builder.model.Meal;
import com.szpiler._04_builder.model.item.burger.MeatBurger;
import com.szpiler._04_builder.model.item.burger.VegBurger;
import com.szpiler._04_builder.model.item.drink.Coke;
import com.szpiler._04_builder.model.item.drink.Pepsi;

public class Program {
  public static void main(String[] args) {
    Meal meatMeal = MealBuilder.buildMeatMeal();
    meatMeal.show();

    System.out.println("----------------------------");

    Meal vegMeal = MealBuilder.buildVegMeal();
    vegMeal.show();

    System.out.println("----------------------------");

    Meal meal = (new MeatBuilderSteps())
      .withItem(new MeatBurger())
      .withItem(new Pepsi())
      .withItem(new VegBurger())
      .withItem(new VegBurger())
      .withItem(new VegBurger())
      .withItem(new VegBurger())
      .withItem(new Coke())
      .build();

    meal.show();
  }
}
