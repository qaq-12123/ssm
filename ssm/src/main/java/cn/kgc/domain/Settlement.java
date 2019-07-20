package cn.kgc.domain;


public class Settlement {

  private int cbody;       //车身
  private int clamp;       //车灯
  private int storage;     //电瓶
  private int oilMeter;    //油料
  private int brake;       //刹车
  private int aircondition;//空调
  private int illegal;     //是否违章
  private int drive;       //试驾
  private int id;          //id
  private int vehicleId;   //车辆id
  private int orderId;     //订单id


  public int getCbody() {
    return cbody;
  }

  public void setCbody(int cbody) {
    this.cbody = cbody;
  }


  public int getClamp() {
    return clamp;
  }

  public void setClamp(int clamp) {
    this.clamp = clamp;
  }


  public int getStorage() {
    return storage;
  }

  public void setStorage(int storage) {
    this.storage = storage;
  }


  public int getOilMeter() {
    return oilMeter;
  }

  public void setOilMeter(int oilMeter) {
    this.oilMeter = oilMeter;
  }


  public int getBrake() {
    return brake;
  }

  public void setBrake(int brake) {
    this.brake = brake;
  }


  public int getAircondition() {
    return aircondition;
  }

  public void setAircondition(int aircondition) {
    this.aircondition = aircondition;
  }


  public int getIllegal() {
    return illegal;
  }

  public void setIllegal(int illegal) {
    this.illegal = illegal;
  }


  public int getDrive() {
    return drive;
  }

  public void setDrive(int drive) {
    this.drive = drive;
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(int vehicleId) {
    this.vehicleId = vehicleId;
  }


  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

}
