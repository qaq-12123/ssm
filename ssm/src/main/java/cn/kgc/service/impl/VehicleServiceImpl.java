package cn.kgc.service.impl;

import cn.kgc.dao.VehicleDao;
import cn.kgc.dao.VehicleImgDao;
import cn.kgc.domain.Vehicle;
import cn.kgc.domain.Vehicleimg;
import cn.kgc.service.VehicleService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDao vehicleDao;
    @Autowired
    private VehicleImgDao vehicleImgDao;

    //根据车牌号查询车辆信息
    @Override
    public Vehicle findByLicense(String license) {
        return vehicleDao.findByLicense(license);
    }

    /**
     * 查询订单里所有的车辆信息
     */
    @Override
    public List<Vehicle> findVehicle() {
        return vehicleDao.findVehicle();
    }

    /**
     * @param id 根据订单id
     */
//    @Override
//    public Vehicle findVehicle(int id) {
//        Vehicle vehicle=vehicleDao.findVehicle(id);
//        vehicle.setList(vehicleImgDao.findById(id));
//        return vehicle;
//    }

}
