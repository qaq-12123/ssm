package cn.kgc.controller;

import cn.kgc.utils.JuheDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 短信验证
 */
@Controller
@RequestMapping("/phone")
@CrossOrigin
public class PhoneController {
    @Autowired
    private JuheDemo juheDemo;

    @RequestMapping("/phones")
    public @ResponseBody String phone(String phone){
        String num = (int) ((Math.random() * 9 + 1) * 100000)+"";
        System.out.println(phone);
        System.out.println(num);
        juheDemo.getRequest2(phone,num);
        return  num;
    }
}
