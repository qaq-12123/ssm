package cn.kgc.service.impl;

import cn.kgc.dao.VEdit;
import cn.kgc.domain.Member;
import cn.kgc.domain.User;
import cn.kgc.service.VEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VEditServiceImpl implements VEditService {
    @Autowired
    VEdit vEdit;
    @Override
    public boolean editphone(String phone) {
        int i =vEdit.editphone(phone);
        if(i!=0){
            if(vEdit.editphone(phone)!=0){
                return  true;
            }
            return  false;
        }
        return  false;
    }

    /**
     *
     * @return  充值
     */
    @Override
    public boolean balanceedit(Float balance, String username) {
        System.out.println(balance);
        if(vEdit.balanceedit(balance,username)!=0){
            return true;
        }
        return false;
    }
    @Override
    public boolean insertV(Member member) {
        List<Member> memberList = findAll();
        List<User> userList = findUser();
        int u = vEdit.insertV(member);
        if(memberList.equals(userList)){
            if(u!=0){
                vEdit.insertV(member);
            }else{
                System.out.println("该字段为必填");
            }
        }
        return false;
    }

    @Override
    public  List<Member> findAll() {
        return vEdit.findAll();
    }

    @Override
    public List<User> findUser() {
        return vEdit.findUser();
    }

}
