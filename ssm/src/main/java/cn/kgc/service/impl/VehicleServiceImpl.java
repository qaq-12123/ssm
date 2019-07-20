package cn.kgc.service.impl;

import cn.kgc.dao.VehicleDao;
import cn.kgc.domain.Vehicle;
import cn.kgc.service.VehicleService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDao vehicleDao;

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

//根据型号查询
    @Override
    public List findAllVehicle() {
        return vehicleDao.findAllVehicle();
    }
//查询150以下
    @Override
    public List<Vehicle> findAll150() {
        return vehicleDao.findAll150();
    }
//查询150  400以下
    @Override
    public List<Vehicle> findAll400() {
        return vehicleDao.findAll400();
    }
//查询400到500以下
    @Override
    public List<Vehicle> findAll500() {
        return vehicleDao.findAll500();
    }
//查询500以上
    @Override
    public List<Vehicle> findAll600() {
        return vehicleDao.findAll600();
    }
//查询舒适型
    @Override
    public List<Vehicle> findAllshu() {
        return vehicleDao.findAllshu();
    }
//查询suv
    @Override
    public List<Vehicle> findAllsuv() {
        return vehicleDao.findAllsuv();
    }
//查询zhongba 
    @Override
    public List<Vehicle> findAllzhong() {
        return vehicleDao.findAllzhong();
    }
//查询经济
    @Override
    public List<Vehicle> findAlljing() {
        return vehicleDao.findAlljing();
    }



		//查询图片
    @Override
    public int findCount() {
        return vehicleDao.findCount();
    }
}
