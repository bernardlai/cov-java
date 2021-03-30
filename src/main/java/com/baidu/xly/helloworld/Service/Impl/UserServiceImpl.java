package com.baidu.xly.helloworld.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.xly.helloworld.dao.UserDao;
import com.baidu.xly.helloworld.domain.User;
import com.baidu.xly.helloworld.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired  
    private UserDao userDao;  
    
    @Override
    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);  
    }

}