package com.wqh.bills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("/hello.html")
    public String hello(){
        return "index";
    }

    @RequestMapping("/test.html")
    public String test(){
        return "/page/test";
    }
}
