package com.szpiler._15_command.command;

import com.szpiler._15_command.model.Stock;

public class BuyStockCommand implements Command {
  private final Stock stock;

  public BuyStockCommand(Stock stock) {
    this.stock = stock;
  }

  @Override
  public void execute() {
    stock.buy();
  }
}
