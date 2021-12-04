package com.szpiler._29_data_access_object.dao;

import com.szpiler._29_data_access_object.model.User;

import java.util.ArrayList;
import java.util.List;

public class MongoUserDao implements UserDao {
  private List<User> users = new ArrayList<>();

  @Override
  public void insert(User user) {
    users.add(user);
  }

  @Override
  public void update(User user) {
    for (User u : users) {
      if (u.equals(user)) {
        u.setUsername(user.getUsername());
        return;
      }
    }
    throw new RuntimeException("User [" + user + "] not found");
  }

  @Override
  public void delete(User user) {
    users.remove(user);
  }

  @Override
  public User getById(int id) {
    for (User u : users) {
      if (u.getId() == id) {
        return u;
      }
    }
    throw new RuntimeException("User with id [" + id + "] not found");
  }

  @Override
  public List<User> getAllUsers() {
    return users;
  }

  @Override
  public List<User> getUsersByUsername(String username) {
    List<User> result = new ArrayList<>();
    for (User u : users) {
      if (u.getUsername().startsWith(username)) {
        result.add(u);
      }
    }
    return result;
  }
}