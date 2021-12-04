package com.szpiler._25_visitor.model.item;

import com.szpiler._25_visitor.model.visitor.ItemVisitor;

public class KeyboardItem implements Item {
  @Override
  public void accept(ItemVisitor itemVisitor) {
    itemVisitor.visit(this);
  }

  public String getKeyboardName() {
    return "keyboard";
  }
}
