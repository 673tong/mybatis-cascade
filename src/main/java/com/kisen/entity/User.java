package com.kisen.entity;


import javax.persistence.Table;

@Table(name = "user")
public class User {

  private long userId;
  private String userName;
  private Dept depInfo;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Dept getDepInfo() {
        return depInfo;
    }

    public void setDepInfo(Dept depInfo) {
        this.depInfo = depInfo;
    }
}
