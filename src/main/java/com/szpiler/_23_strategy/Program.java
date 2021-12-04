package com.szpiler._23_strategy;

import com.szpiler._23_strategy.model.AddStrategy;
import com.szpiler._23_strategy.model.Command;
import com.szpiler._23_strategy.model.MultiplyStrategy;
import com.szpiler._23_strategy.model.SubtractStrategy;

public class Program {
  public static void main(String[] args) {
    int a = 12, b = 5;

    Command command1 = new Command(new AddStrategy());
    System.out.println(a + " + " + b + " = " + command1.execute(a, b));

    Command command2 = new Command(new SubtractStrategy());
    System.out.println(a + " - " + b + " = " + command2.execute(a, b));

    Command command3 = new Command(new MultiplyStrategy());
    System.out.println(a + " * " + b + " = " + command3.execute(a, b));
  }
}
