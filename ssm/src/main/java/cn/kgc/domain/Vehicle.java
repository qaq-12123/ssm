package cn.kgc.domain;


public class Vehicle {

  private Integer id;
  private String brand;
  private String type;
  private String driveType;
  private Integer seat;
  private Integer rentMoney;
  private String quality;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getDriveType() {
    return driveType;
  }

  public void setDriveType(String driveType) {
    this.driveType = driveType;
  }


  public Integer getSeat() {
    return seat;
  }

  public void setSeat(Integer seat) {
    this.seat = seat;
  }


  public Integer getRentMoney() {
    return rentMoney;
  }

  public void setRentMoney(Integer rentMoney) {
    this.rentMoney = rentMoney;
  }


  public String getQuality() {
    return quality;
  }

  public void setQuality(String quality) {
    this.quality = quality;
  }

}
