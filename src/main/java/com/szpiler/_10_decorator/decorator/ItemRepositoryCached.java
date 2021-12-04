package com.szpiler._10_decorator.decorator;

import com.szpiler._10_decorator.model.Item;

public class ItemRepositoryCached extends ItemRepository {
  private final ItemRepository itemRepository;
  private Item cache;

  public ItemRepositoryCached(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  public Item getById(int id) {
    if (cache == null) {
      cache = itemRepository.getById(id);
    }
    return cache;
  }
}
