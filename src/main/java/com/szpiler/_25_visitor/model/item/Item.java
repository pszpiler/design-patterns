package com.szpiler._25_visitor.model.item;

import com.szpiler._25_visitor.model.visitor.ItemVisitor;

public interface Item {
  void accept(ItemVisitor itemVisitor);
}
