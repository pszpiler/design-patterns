package com.szpiler._25_visitor.model.visitor;

import com.szpiler._25_visitor.model.item.KeyboardItem;
import com.szpiler._25_visitor.model.item.MouseItem;
import com.szpiler._25_visitor.model.item.ScreenItem;

public interface ItemVisitor {
  void visit(MouseItem item);

  void visit(KeyboardItem item);

  void visit(ScreenItem item);
}