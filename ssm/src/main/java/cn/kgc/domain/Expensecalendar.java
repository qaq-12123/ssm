package com.sample;


public class Expensecalendar {

  private long id;
  private long pjmoney;
  private String cModel;
  private java.sql.Timestamp gTime;
  private java.sql.Timestamp bTime;
  private String rental;
  private String done;
  private String operate;
  private long vid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getPjmoney() {
    return pjmoney;
  }

  public void setPjmoney(long pjmoney) {
    this.pjmoney = pjmoney;
  }


  public String getCModel() {
    return cModel;
  }

  public void setCModel(String cModel) {
    this.cModel = cModel;
  }


  public java.sql.Timestamp getGTime() {
    return gTime;
  }

  public void setGTime(java.sql.Timestamp gTime) {
    this.gTime = gTime;
  }


  public java.sql.Timestamp getBTime() {
    return bTime;
  }

  public void setBTime(java.sql.Timestamp bTime) {
    this.bTime = bTime;
  }


  public String getRental() {
    return rental;
  }

  public void setRental(String rental) {
    this.rental = rental;
  }


  public String getDone() {
    return done;
  }

  public void setDone(String done) {
    this.done = done;
  }


  public String getOperate() {
    return operate;
  }

  public void setOperate(String operate) {
    this.operate = operate;
  }


  public long getVid() {
    return vid;
  }

  public void setVid(long vid) {
    this.vid = vid;
  }

}
