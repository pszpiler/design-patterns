package com.szpiler._18_mediator.example_2;

import com.szpiler._18_mediator.example_2.model.ChatRoom;
import com.szpiler._18_mediator.example_2.model.User;

public class Program {
  public static void main(String[] args) {
    ChatRoom chatRoom = new ChatRoom();

    User janek = new User("janek", chatRoom);
    User katie = new User("katie", chatRoom);
    User ann = new User("ann", chatRoom);

    janek.sendMessage("testing");
    katie.sendMessage("hello!");
  }
}
