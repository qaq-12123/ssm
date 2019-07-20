package cn.kgc.service.impl;

import cn.kgc.dao.SettlementDao;
import cn.kgc.domain.HYData;
import cn.kgc.domain.Settlement;
import cn.kgc.service.SettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("settlementService")
public class SettlementServiceImpl implements SettlementService {
    @Autowired
    private SettlementDao settlementDao;
    private String orderNo;

    /**
     * @param orderNo 订单ID
     * @return 根据订单id返回车辆状况
     */
    @Override
    public Settlement findByOrderId(String orderNo) {
        return settlementDao.findByOrderId(orderNo);
    }

    @Override
    public List<HYData> findHYAll() {
        return settlementDao.findHYAll();
    }
}
