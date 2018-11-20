package com.demo.service.impl;


import com.demo.dao.UserDao;
import com.demo.entity.User;
import com.demo.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    private static final Logger log = Logger.getLogger(UserServiceImpl.class);

    @Resource
    private UserDao udao;

    public User selectUserById(int userId) {
        return udao.selectUserById(userId);
    }
}
