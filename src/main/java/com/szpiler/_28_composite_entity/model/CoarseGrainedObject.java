package com.szpiler._28_composite_entity.model;

class CoarseGrainedObject {
  private final DependentObject1 do1 = new DependentObject1();
  private final DependentObject2 do2 = new DependentObject2();

  void setData(String data1, String data2) {
    do1.setData(data1);
    do2.setData(data2);
  }

  String[] getData() {
    return new String[]{
      do1.getData(),
      do2.getData()
    };
  }
}