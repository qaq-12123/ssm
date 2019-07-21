package cn.kgc.service;

import cn.kgc.domain.FBphone;
import cn.kgc.domain.Member;
import cn.kgc.domain.Phone;
import cn.kgc.domain.User;

import java.util.List;

public interface VEditService {

    public boolean editphone(String phone);

    public boolean setPjmoney(User user);

    public boolean insertV(Member member);

    public boolean update(User user);


    List<Member> findAll();

    List<User> findUser();

    public User findByphone(String phone);

    public List<FBphone> findAllByPhone(String phone);

    public boolean setPhone(Phone phone);
}
