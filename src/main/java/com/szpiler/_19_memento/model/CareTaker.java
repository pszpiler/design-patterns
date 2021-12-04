package com.szpiler._19_memento.model;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
  private int index;
  private final List<Memento> mementos = new ArrayList<>();

  public int put(Memento memento) {
    mementos.add(index, memento);
    return index++;
  }

  public Memento get(int index) {
    return mementos.get(index);
  }
}

