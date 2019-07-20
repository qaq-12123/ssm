package cn.kgc.controller;

import cn.kgc.dao.VehicleImgDao;
import cn.kgc.domain.Vehicle;
import cn.kgc.domain.Vehicleimg;
import cn.kgc.service.VehicleService;
import cn.kgc.service.impl.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/vehicle")
@CrossOrigin
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private VehicleImgDao vd;

    @RequestMapping("/findByLicense")
    @ResponseBody
    public  Vehicle findByLisence( String license) {

        return vehicleService.findByLicense(license);
    }

    @RequestMapping("/findByImg")
    @ResponseBody
    public List<Vehicleimg> findByImg(Integer id) {
            List<Vehicleimg> list=new ArrayList<>();
            if(id!=null) {
                return vd.findById(id);
            }
          return list;
    }



}
