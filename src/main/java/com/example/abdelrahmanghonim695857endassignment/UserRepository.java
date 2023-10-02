package com.example.abdelrahmanghonim695857endassignment;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
  private List<User> users;

  public UserRepository() {
    users = new ArrayList<>();
    User user1 = new User("Ghonim111", "Student000");
    User user2 = new User("MrWim111", "Teacher000");

    users.add(user1);
    users.add(user2);
  }

  public boolean isValidCredentials(String userName, String password) {
    for (User user : users) {
      if (userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
        return true;
      }
    }
return false;
  }

  public List<User> getUsers() {
    return this.users;
  }
}
