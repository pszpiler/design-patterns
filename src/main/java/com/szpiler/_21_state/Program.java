package com.szpiler._21_state;

import com.szpiler._21_state.model.Button;

public class Program {
  public static void main(String[] args) {
    Button button = new Button();
    System.out.println("current state = " + button.getState().getName());

    for (int i = 0; i < 10; i++) {
      button.push();
      System.out.println("current state = " + button.getState().getName());
    }

  }
}
