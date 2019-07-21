package cn.kgc.controller;

import cn.kgc.utils.JuheDemo;
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

    @RequestMapping("/phones")
    public @ResponseBody
    String phone(String phone){
        String num = (int) ((Math.random() * 9 + 1) * 100000) + "";
        System.out.println(phone);
        JuheDemo.getRequest2(phone,num);
        return num;
    }
}
