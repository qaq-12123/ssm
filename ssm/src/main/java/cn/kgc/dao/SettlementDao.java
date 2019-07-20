package cn.kgc.dao;

import cn.kgc.domain.HYData;
import cn.kgc.domain.Settlement;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SettlementDao {

    /**
     * @param orderNo 订单ID
     * @return 根据订单id返回车辆状况
     * */
    @Select("select * from settlement where orderNo=#{orderNo}")
    public Settlement findByOrderId(String orderNo);

    @Select("select g_time, c_model, b_time, rental, done, operate,vid from expensecalendar LEFT JOIN vehicle on vid=vehicle.id ")
    public  List<HYData> findHYAll();
}
