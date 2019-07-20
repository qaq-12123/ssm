package cn.kgc.dao;

import cn.kgc.domain.Vehicleimg;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleImgDao {
    /**
     *
     * @param id 根据订单ID查询车辆图片
     * @return
     */
    @Select("select vimg from vehicleImg where vid=(select vid from `order` where id=#{id})  ")
    public List<Vehicleimg> findById(int id);
}
