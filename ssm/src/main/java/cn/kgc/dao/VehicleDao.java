package cn.kgc.dao;

import cn.kgc.domain.Vehicle;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleDao {

    /**
    * @param license  车牌号
    * @return 车辆信息
    * 根据车牌号查询车辆信息
    * */
    @Select("select * from vehicle where license=#{license}")
    public Vehicle findByLicense(String license);


    /**
     *查询订单里所有的车辆信息
     *
     * */
    @Select("select *  from vehicle where id in(select vid from `order`)")
    public List<Vehicle> findVehicle();
}
