package cn.kgc.service;

import cn.kgc.domain.EandV;
import cn.kgc.domain.Member;
import cn.kgc.domain.User;

import java.util.List;


public interface RechargeAmoutService {
    public Member InFormation(String phone);
    public List<User> findUser();
    public List<EandV> findAVE();
}
