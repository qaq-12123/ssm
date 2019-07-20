package cn.kgc.service.impl;

import cn.kgc.dao.UserDao;
import cn.kgc.domain.User;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    /**
     * @param
     * @return fan返回user对象
     */
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> findAllUid() {
        return userDao.findAllUid();
    }
}
