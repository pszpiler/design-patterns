package com.szpiler._29_data_access_object;

import com.szpiler._29_data_access_object.dao.MongoUserDao;
import com.szpiler._29_data_access_object.model.User;

import java.util.List;

public class Program {
  public static void main(String[] args) {
    MongoUserDao mongoUserDao = new MongoUserDao();

    List<User> users = mongoUserDao.getAllUsers();
    showUsers(users);

    mongoUserDao.insert(new User(1, "Janek"));
    showUsers(users);

    mongoUserDao.insert(new User(2, "James"));
    mongoUserDao.insert(new User(3, "Mary"));
    showUsers(users);

    mongoUserDao.update(new User(3, "Mary Jane"));
    showUsers(users);

    mongoUserDao.delete(new User(3, "Mary Jane"));
    showUsers(users);

    User james = mongoUserDao.getById(2);
    System.out.println(james);
    showUsers(users);

    List<User> res = mongoUserDao.getUsersByUsername("Jan");
    showUsers(res);
  }

  private static void showUsers(List<User> users) {
    for (User user : users) {
      System.out.println("id = " + user.getId() + " username = " + user.getUsername());
    }
    System.out.println("---------------------------");
  }
}
