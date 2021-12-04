package com.szpiler._19_memento;

import com.szpiler._19_memento.model.CareTaker;
import com.szpiler._19_memento.model.Originator;

public class Program {
  public static void main(String[] args) {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    System.out.println("state : " + originator.getState());

    originator.setState("#1");
    System.out.println("state : " + originator.getState());

    originator.setState("#2");
    int index1 = careTaker.put(originator.save());
    System.out.println("state : " + originator.getState());

    originator.setState("#3");
    int index2 = careTaker.put(originator.save());
    System.out.println("state : " + originator.getState());

    System.out.println("-----------------------------------------");

    originator.restore(careTaker.get(index1));
    System.out.println("restored state : " + originator.getState());

    originator.restore(careTaker.get(index2));
    System.out.println("restored state : " + originator.getState());

  }
}
