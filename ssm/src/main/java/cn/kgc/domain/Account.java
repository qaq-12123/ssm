package cn.kgc.domain;

import java.util.Date;
public class Account {

  private int id;
  private String name;
  private String password;
  private int integral; //积分
  private int pjmoney;  //平驾币
  private double balance; //
  private Date createDate;
  private int uid;
  private int rechargeId;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public int getIntegral() {
    return integral;
  }

  public void setIntegral(int integral) {
    this.integral = integral;
  }


  public int getPjmoney() {
    return pjmoney;
  }

  public void setPjmoney(int pjmoney) {
    this.pjmoney = pjmoney;
  }


  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }


  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }


  public int getRechargeId() {
    return rechargeId;
  }

  public void setRechargeId(int rechargeId) {
    this.rechargeId = rechargeId;
  }

}
