package com.szpiler._04_builder.model;

import com.szpiler._04_builder.model.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
  private List<Item> items = new ArrayList<>();

  public void addItem(Item item) {
    items.add(item);
  }

  public float getTotalCost() {
    float totalCost = 0.0f;

    for (Item item : items) {
      totalCost += item.getCost();
    }

    return totalCost;
  }

  public void show() {
    for (Item item : items) {
      System.out.println("name = " + item.getName() + " cost = " + item.getCost() + " package = " + item.getPackage().pack());
    }
    System.out.println("total cost = " + getTotalCost());
  }
}
