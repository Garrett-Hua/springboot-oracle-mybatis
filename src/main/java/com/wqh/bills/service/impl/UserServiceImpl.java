package com.wqh.bills.service.impl;

import com.wqh.bills.entity.User;
import com.wqh.bills.mapper.UserMapper;
import com.wqh.bills.model.user.LoginRecord;
import com.wqh.bills.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }

    @Override
    public User selectUserById(BigDecimal id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean login(LoginRecord loginRecord) {
        boolean resultFlag = false;
        User user = userMapper.login(loginRecord);
        if (user != null){
            resultFlag = true;
        }
        return resultFlag;
    }
}
