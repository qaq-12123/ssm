package cn.kgc.service;

import cn.kgc.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {

    /**
     *
     * @return fan返回user对象
     * */

    public List<User> findAll();

    public List<User> findAllUid();
}
