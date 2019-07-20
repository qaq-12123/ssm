package cn.kgc.service;

import cn.kgc.domain.HYData;
import cn.kgc.domain.Settlement;

import java.util.List;

public interface SettlementService {

    /**
     * @param orderNo 订单ID
     * @return 根据订单id返回车辆状况
     * */
    public Settlement findByOrderId(String orderNo);


    public List<HYData> findHYAll();
}
