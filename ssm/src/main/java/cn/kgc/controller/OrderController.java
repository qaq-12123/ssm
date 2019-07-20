package cn.kgc.controller;

import cn.kgc.domain.*;
import cn.kgc.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private SettlementService settlementService;
    @Autowired
    private UserService userService;
    @Autowired
    private AccountService accountService;
    @Autowired
    private VehicleService vehicleService;


    @RequestMapping("/settlement")
    @ResponseBody
    public Object[] settlement(String orderNo){
        Object[] str={orderService.findByOrderNo(orderNo),settlementService.findByOrderId(orderNo)};
        return  str;
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public  List findAll(){

       List list= orderService.findAllOrder();
        int a=list.size();
        list.add(userService.findAllUid());
        list.add(vehicleService.findVehicle());
       for (int i=0;i<a;i++){

           String str="checked"+(i+1)+": false";
           list.add(str);
       }


        return list;
    }
    @RequestMapping("/findAllData")
    @ResponseBody
    public List<YDdata> findAllData(){
        List<YDdata> list=orderService.findAllData();
        for(int i=0;i<list.size();i++){
            String str="checked"+(i+1)+":false";
            list.get(i).setId(str);

        }
        return list;
    }

    @RequestMapping("/findOrderNo")
    @ResponseBody
    public SDData findByOrderNo(String orderNo){
            if(orderNo!=null){
                return orderService.findOrderNo(orderNo);
            }
      return new SDData();
    }


    @RequestMapping("/deleteByOrderNo")
    @ResponseBody
    public boolean deleteByOrderNo(String orderNo){
            if(orderNo!=null) {
                return orderService.delByOrderNo(orderNo);
            }
            return  false;
    }



    @RequestMapping("/findHYAll")
    @ResponseBody
    public  List<HYData> findHYAll(){
        return settlementService.findHYAll();
    }


}
