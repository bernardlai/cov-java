package com.baidu.xly.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.xly.helloworld.domain.User;
import com.baidu.xly.helloworld.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get-info")
    public String getInfo() {
        System.out.println("===========================================");
        return "";
    }

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer param) {
        System.out.println("laihh===========================================");
        System.out.println(param);
        User user = userService.selectUserById(param);
        //String url = "http://localhost:8080/api/get-info"
        //String rs = HttpUtil.post(url, null, params);
        return user;
    }

}
