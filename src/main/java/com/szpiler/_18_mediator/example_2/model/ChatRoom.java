package com.szpiler._18_mediator.example_2.model;

import java.util.HashSet;
import java.util.Set;

public class ChatRoom {
  private final Set<User> participants = new HashSet<>();

  void sendMessage(User user, String message) {
    for (User participant : participants) {
      if (participant != user) {
        System.out.println("[" + participant.getName() + "] received message [" + message + "] from [" + user.getName() + "]");
      }
    }
  }

  void addParticipant(User user) {
    participants.add(user);
  }
}
