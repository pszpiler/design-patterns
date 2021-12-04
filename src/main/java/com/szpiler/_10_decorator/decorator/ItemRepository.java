package com.szpiler._10_decorator.decorator;

import com.szpiler._10_decorator.model.Item;

import java.util.List;

public class ItemRepository {
  private List<Item> items;

  public Item getById(int id) {
    System.out.println("getById");
    for (Item item : items) {
      if (item.getId() == id) {
        return item;
      }
    }
    throw new RuntimeException("Item not found by id [" + id + "].");
  }

  public void load(List<Item> items) {
    this.items = items;
  }
}
