package cn.kgc.domain;

import java.util.Date;
public class Order {

  private int id;                 //id
  private String orderNo;         //订单号
  private String orderStatue;     //订单状态
  private Date collectionTime;    //取车时间
  private int rentTime;           //租车时间
  private String collectionCity;  //取车城市
  private String colleationStore; //取车门店
  private String returnStore;     //还车门店
  private String returnCity;      //还车城市
  private Date returnTime;        //还车时间
  private double earnest;         //定金
  private Date target;            // 预定时间
  private int vid;                //车辆ID
  private int aid;                //账户Id


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public String getOrderStatue() {
    return orderStatue;
  }

  public void setOrderStatue(String orderStatue) {
    this.orderStatue = orderStatue;
  }


  public Date getCollectionTime() {
    return collectionTime;
  }

  public void setCollectionTime(Date collectionTime) {
    this.collectionTime = collectionTime;
  }


  public int getRentTime() {
    return rentTime;
  }

  public void setRentTime(int rentTime) {
    this.rentTime = rentTime;
  }


  public String getCollectionCity() {
    return collectionCity;
  }

  public void setCollectionCity(String collectionCity) {
    this.collectionCity = collectionCity;
  }


  public String getColleationStore() {
    return colleationStore;
  }

  public void setColleationStore(String colleationStore) {
    this.colleationStore = colleationStore;
  }


  public String getReturnStore() {
    return returnStore;
  }

  public void setReturnStore(String returnStore) {
    this.returnStore = returnStore;
  }


  public String getReturnCity() {
    return returnCity;
  }

  public void setReturnCity(String returnCity) {
    this.returnCity = returnCity;
  }


  public Date getReturnTime() {
    return returnTime;
  }

  public void setReturnTime(Date returnTime) {
    this.returnTime = returnTime;
  }


  public double getEarnest() {
    return earnest;
  }

  public void setEarnest(double earnest) {
    this.earnest = earnest;
  }


  public Date getTarget() {
    return target;
  }

  public void setTarget(Date target) {
    this.target = target;
  }


  public int getVid() {
    return vid;
  }

  public void setVid(int vid) {
    this.vid = vid;
  }


  public int getAid() {
    return aid;
  }

  public void setAid(int aid) {
    this.aid = aid;
  }

}
