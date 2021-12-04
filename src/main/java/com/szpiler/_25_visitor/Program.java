package com.szpiler._25_visitor;

import com.szpiler._25_visitor.model.item.Item;
import com.szpiler._25_visitor.model.item.KeyboardItem;
import com.szpiler._25_visitor.model.item.MouseItem;
import com.szpiler._25_visitor.model.item.ScreenItem;
import com.szpiler._25_visitor.model.visitor.ItemVisitor;
import com.szpiler._25_visitor.model.visitor.OneVisitor;
import com.szpiler._25_visitor.model.visitor.TwoVisitor;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Item> items = new ArrayList<>();

    items.add(new MouseItem());
    items.add(new KeyboardItem());
    items.add(new ScreenItem());

    ItemVisitor oneVisitor = new OneVisitor();
    ItemVisitor twoVisitor = new TwoVisitor();

    for (Item item : items) {
      item.accept(oneVisitor);
    }

    System.out.println("---------------------");

    for (Item item : items) {
      item.accept(twoVisitor);
    }
  }
}
