package cn.kgc.service.impl;

import cn.kgc.dao.AccountDao;
import cn.kgc.domain.Account;
import cn.kgc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    /**
     * @param phone 根据手机号查询账户信息
     * @return
     */
    @Override
    public Account findByPhone(String phone) {
        return accountDao.findByPhone(phone);
    }
}
