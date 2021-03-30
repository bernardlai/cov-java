package com.baidu.xly.helloworld.service;

import com.baidu.xly.helloworld.domain.User;

public interface UserService {
    User selectUserById(Integer userId); 
}