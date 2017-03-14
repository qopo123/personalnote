package com.myproject.entity;

import java.io.Serializable;

/**
 * 用户表
 * 
 * @author Administrator
 *
 */
public class User implements Serializable {

  private static final long serialVersionUID = 1134657805958062178L;

  private Integer id;
  private String name;
  private String passWord;

  private Integer roleId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


}
