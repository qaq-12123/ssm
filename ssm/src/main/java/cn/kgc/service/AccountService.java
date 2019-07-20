package cn.kgc.service;


import cn.kgc.domain.Account;
import org.apache.ibatis.annotations.Select;

public interface AccountService {

    /**
     *
     * @param phone 根据手机号查询账户信息
     * @return
     */
    @Select("select * from account where uid=(select id from user where phone=#{phone})")
    public Account findByPhone(String phone);

}
