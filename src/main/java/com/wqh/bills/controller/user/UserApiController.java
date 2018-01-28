package com.wqh.bills.controller.user;

import com.wqh.bills.entity.User;
import com.wqh.bills.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApiController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/selectUserById",method = RequestMethod.GET)
    public User selectUserById(BigDecimal id){
        return userService.selectUserById(id);
    }

    @RequestMapping("/selectUserList")
    public List<User> selectUserList(){
        return userService.selectUserList();
    }
}
