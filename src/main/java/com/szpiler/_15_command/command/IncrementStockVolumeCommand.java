package com.szpiler._15_command.command;

import com.szpiler._15_command.model.Stock;

public class IncrementStockVolumeCommand implements Command {
  private final Stock stock;

  public IncrementStockVolumeCommand(Stock stock) {
    this.stock = stock;
  }

  @Override
  public void execute() {
    stock.incr();
  }
}
