package cn.kgc.controller;

import cn.kgc.utils.JuheDemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 短信验证
 */
@Controller
@RequestMapping("/phone")
@CrossOrigin
public class PhoneController {

    @RequestMapping("/phones")
    public String phone(String phone){
        String num = "121212";
        phone = "17550062722";
        JuheDemo.getRequest2(phone,num);
        return num;
    }
}
