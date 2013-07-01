package com.example.testviewpager;

import java.io.Serializable;

public class UserBean implements Serializable{
  
  private static final long serialVersionUID = -595376113170932897L;
  
  private String userName;
  
  public UserBean(String userName) {
    super();
    this.userName = userName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }



}
