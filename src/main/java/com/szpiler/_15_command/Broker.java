package com.szpiler._15_command;

import com.szpiler._15_command.command.Command;

import java.util.ArrayList;
import java.util.List;

class Broker {
  private final List<Command> commands = new ArrayList<>();

  void put(Command command) {
    commands.add(command);
  }

  void execute() {
    for (Command command : commands) {
      command.execute();
    }
  }
}
