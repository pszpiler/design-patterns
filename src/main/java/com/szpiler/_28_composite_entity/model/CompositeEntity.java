package com.szpiler._28_composite_entity.model;

class CompositeEntity {
  private final CoarseGrainedObject cgo = new CoarseGrainedObject();

  void setData(String data1, String data2) {
    cgo.setData(data1, data2);
  }

  String[] getData() {
    return cgo.getData();
  }
}