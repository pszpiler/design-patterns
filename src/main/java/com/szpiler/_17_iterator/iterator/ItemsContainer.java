package com.szpiler._17_iterator.iterator;

import com.szpiler._17_iterator.model.Item;

public class ItemsContainer implements Container {
  private final Item[] items;

  public ItemsContainer(Item[] items) {
    this.items = items;
  }

  @Override
  public Iterator getIterator() {
    return new ItemsIterator();
  }

  private class ItemsIterator implements Iterator {
    private int index = 0;

    @Override
    public boolean hasNext() {
      return index < items.length;
    }

    @Override
    public Object next() {
      if (hasNext()) {
        return items[index++];
      }
      return null;
    }

    public int index() {
      return index;
    }
  }
}
