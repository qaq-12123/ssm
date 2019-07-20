package cn.kgc.dao;

import cn.kgc.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /**
     *
     * @return fan返回user对象
     * */
    @Select("select * from user")
    public List<User> findAll();


    @Select("select * from administrator where id in (select uid from `order`)")
    public List<User> findAllUid();
}
