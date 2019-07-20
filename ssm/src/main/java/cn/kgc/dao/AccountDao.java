package cn.kgc.dao;

import cn.kgc.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao {
    /**
     *
     * @param phone 根据手机号查询账户信息
     * @return
     */
    @Select("select * from account where uid=(select id from user where phone=#{phone})")
    public Account findByPhone(String phone);
}
