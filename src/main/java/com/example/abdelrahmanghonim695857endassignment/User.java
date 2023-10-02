package com.example.abdelrahmanghonim695857endassignment;

import java.util.ArrayList;
import java.util.List;

public class User {
  private String userName;
  private String password;

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
    //User user1=new User("Ghonim111","Student0000");
    //User user2=new User("MrWim111","Teacher0000");

  }
  public String getUserName()
  {
    return this.userName;
  }
  public String getPassword()
  {
    return this.password;
  }

}
