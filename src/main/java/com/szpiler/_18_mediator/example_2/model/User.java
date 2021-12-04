package com.szpiler._18_mediator.example_2.model;

public class User {
  private final String name;
  private final ChatRoom chatRoom;

  public User(String name, ChatRoom chatRoom) {
    this.name = name;
    this.chatRoom = chatRoom;
    chatRoom.addParticipant(this);
  }

  public String getName() {
    return name;
  }

  public void sendMessage(String message) {
    chatRoom.sendMessage(this, message);
  }
}
