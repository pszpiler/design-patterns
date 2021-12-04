package com.szpiler._29_data_access_object.dao;

import com.szpiler._29_data_access_object.model.User;

import java.util.List;

public interface UserDao {
  public void insert(User user);

  public void update(User user);

  public void delete(User user);

  public User getById(int id);

  public List<User> getAllUsers();

  public List<User> getUsersByUsername(String username);
}
