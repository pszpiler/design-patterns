package com.szpiler._20_observer;

import com.szpiler._20_observer.model.*;

public class Program {
  public static void main(String[] args) {
    Subject subject = new Subject(5);

    new DecimalObserver(subject);
    new BinaryObserver(subject);
    new HexObserver(subject);
    new OctalObserver(subject);

    subject.setNumber(12);
    System.out.println("--------------------");

    subject.setNumber(15);
    System.out.println("--------------------");

    subject.setNumber(18);
    System.out.println("--------------------");

    subject.setNumber(25);
    System.out.println("--------------------");
  }
}
