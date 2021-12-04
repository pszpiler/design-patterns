package com.szpiler._15_command;

import com.szpiler._15_command.command.BuyStockCommand;
import com.szpiler._15_command.command.IncrementStockVolumeCommand;
import com.szpiler._15_command.command.SellStockCommand;
import com.szpiler._15_command.model.Stock;

public class Program {
  public static void main(String[] args) {
    Stock appleStock = new Stock("apple");
    Stock googleStock = new Stock("google");

    Broker broker = new Broker();

    broker.put(new BuyStockCommand(appleStock));
    broker.put(new BuyStockCommand(googleStock));

    broker.put(new SellStockCommand(googleStock));
    broker.put(new SellStockCommand(appleStock));

    broker.put(new IncrementStockVolumeCommand(googleStock));

    broker.execute();
  }
}
