package com.baidu.xly.helloworld.dao;

import org.apache.ibatis.annotations.Mapper;
import com.baidu.xly.helloworld.domain.User;

@Mapper
public interface UserDao {  
    public User selectUserById(Integer userId);  
  
}  