package com.wqh.bills.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page/user")
public class UserPageController {

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "user/login";
    }
}
