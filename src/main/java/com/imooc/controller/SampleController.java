package com.imooc.controller;

import com.imooc.service.JedisService;
import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tl on 2019/3/3.
 */

@Controller
@RequestMapping("/demo")
public class SampleController {


    @Autowired
    UserService userService;

    @Autowired
    JedisService jedisService;



    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","fucking");
        return "hello";
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get(){
        return userService.getById(10 ).toString();
    }

    @RequestMapping("/jedisTest")
    public String jedisTest(){
        jedisService.insert("you","fuck");

        return "hello";
    }

}
