package cn.kgc.controller;

import cn.kgc.domain.Member;
import cn.kgc.domain.Phone;
import cn.kgc.domain.User;
import cn.kgc.service.VEditService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/edit")
@CrossOrigin
public class VEditController {
    @Autowired
    VEditService vEditService;
    @ResponseBody
    @RequestMapping("/editphone")
    @CrossOrigin
    public boolean updatephone(String phone){
        if(phone!=null){
         return vEditService.editphone(phone);
        }
        return  false;
    }
    @ResponseBody
    @RequestMapping("/editbalance")
    @CrossOrigin
    public boolean updatemoney(User user){
        if(user.getPhone()!=null) {
            return vEditService.setPjmoney(user);
        }
        return false;
    }
    @ResponseBody
    @RequestMapping("/editmember")
    @CrossOrigin
    public boolean insertV(Member member){
        if(member!=null){
           return vEditService.insertV(member);
        }
        return false;
    }
    @ResponseBody
    @RequestMapping("/findAll")
    @CrossOrigin
    public List<Member> findAll(){
        return vEditService.findAll();
    }

    @ResponseBody
    @RequestMapping("/findUser")
    @CrossOrigin
    public List<User> findUser(){
        return vEditService.findUser();
    }

    @ResponseBody
    @RequestMapping("/findByPhone")
    public List findByPhone(String phone){
        System.out.println(phone);
        List list=new ArrayList();
        list.add(vEditService.findByphone(phone));
        list.add(vEditService.findAllByPhone(phone));
        return list;
    }

    @ResponseBody
    @RequestMapping("/setNewPhone")
    public boolean setNewPhone(Phone phone){
        if(phone!=null){
            return  vEditService.setPhone(phone);
        }
        return  false;
    }

}
