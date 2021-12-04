package com.szpiler._17_iterator;

import com.szpiler._17_iterator.iterator.ItemsContainer;
import com.szpiler._17_iterator.iterator.Iterator;
import com.szpiler._17_iterator.model.Item;

public class Program {
  public static void main(String[] args) {
    Item[] items = {
      new Item("A"),
      new Item("B"),
      new Item("C")
    };

    ItemsContainer itemsContainer = new ItemsContainer(items);

    for (Iterator iterator = itemsContainer.getIterator(); iterator.hasNext(); ) {
      Item item = (Item) iterator.next();
      System.out.println("[" + iterator.index() + "] = " + item.getName());
    }
  }
}
