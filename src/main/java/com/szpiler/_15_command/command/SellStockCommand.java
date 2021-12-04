package com.szpiler._15_command.command;

import com.szpiler._15_command.model.Stock;

public class SellStockCommand implements Command {
  private final Stock stock;

  public SellStockCommand(Stock stock) {
    this.stock = stock;
  }

  @Override
  public void execute() {
    stock.sell();
  }
}
