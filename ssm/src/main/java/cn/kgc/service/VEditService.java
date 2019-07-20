package cn.kgc.service;

import cn.kgc.domain.Member;
import cn.kgc.domain.User;

import java.util.List;

public interface VEditService {

    public boolean editphone(String phone);

    public boolean balanceedit(Float balance, String username);

    public boolean insertV(Member member);


    List<Member> findAll();

    List<User> findUser();
}
