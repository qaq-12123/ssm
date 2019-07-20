package cn.kgc.service;

import cn.kgc.domain.Vehicle;

import java.util.List;


public interface VehicleService {



    /**
     * @param license  车牌号
     * @return 车辆信息
     * 根据车牌号查询车辆信息
     * */
    public Vehicle findByLicense(String license);

    /**
     *查询订单里所有的车辆信息
     *
     * */
    public List<Vehicle> findVehicle();
}
