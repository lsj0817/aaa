package com.example.demo.controller;

import com.example.demo.entity.Clazz;
import com.example.demo.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ClazzController {
    @Autowired
    private ClazzService clazzservice;

    @RequestMapping("/selectClazz")
    public ModelAndView selectClazz(){
            List<Clazz> clazzs = clazzservice.selectClazz();
        System.out.println(clazzs.toString());
            ModelAndView mav = new ModelAndView();
            mav.addObject("clazzs",clazzs);
            mav.setViewName("add_student");
            return mav;

        }
}
