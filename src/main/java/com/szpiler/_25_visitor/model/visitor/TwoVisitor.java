package com.szpiler._25_visitor.model.visitor;

import com.szpiler._25_visitor.model.item.KeyboardItem;
import com.szpiler._25_visitor.model.item.MouseItem;
import com.szpiler._25_visitor.model.item.ScreenItem;

public class TwoVisitor implements ItemVisitor {
  @Override
  public void visit(MouseItem item) {
    System.out.println("two visitor, item " + item.getMouseName());
  }

  @Override
  public void visit(KeyboardItem item) {
    System.out.println("two visitor, item " + item.getKeyboardName());
  }

  @Override
  public void visit(ScreenItem item) {
    System.out.println("two visitor, item " + item.getScreenName());
  }
}
