package com.wqh.bills.service;

import com.wqh.bills.entity.User;

import java.math.BigDecimal;
import java.util.List;

public interface UserService {

    List<User> selectUserList();

    User selectUserById(BigDecimal id);
}
