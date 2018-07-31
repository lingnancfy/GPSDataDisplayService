package com.icbc.dataDisplayService.controller;

import com.icbc.dataDisplayService.bean.GPS;
import com.icbc.dataDisplayService.service.GPSdataService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GPSController {

    @RequestMapping(value = "/")
    public ModelAndView gpsDataHandler(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:xml/mybatis/applicationContext-MFBean.xml");
        GPSdataService gpSdataService = (GPSdataService) ac.getBean("gpsService");
        List<GPS> gpsDataList = gpSdataService.getAllGPSData();
        System.out.println(gpsDataList);

        ModelAndView mav = new ModelAndView();
        Map<String,List> weatherToJSP = new HashMap<String, List>();
        weatherToJSP.put("now",gpsDataList);
        mav.addObject("map",weatherToJSP);
        mav.setViewName("gps");

        return mav;
    }
}
