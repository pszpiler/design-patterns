package com.szpiler._30_front_controller.model;

class Dispatcher {
  private final StudentView studentView = new StudentView();
  private final HomeView homeView = new HomeView();
  private final DefaultView defaultView = new DefaultView();

  void dispatch(String request) {
    if (request.equalsIgnoreCase("student")) {
      studentView.render();
      return;
    }
    if (request.equalsIgnoreCase("home")) {
      homeView.render();
      return;
    }
    defaultView.render();
  }
}
