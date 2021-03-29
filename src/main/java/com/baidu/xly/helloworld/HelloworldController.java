package com.baidu.xly.helloworld;

import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import com.baidu.xly.helloworld.domain.User;
import com.baidu.xly.helloworld.service.UserService;

@Controller
public class HelloworldController {

    @Value("${icafe.url}")
    private String port;

    @Autowired 
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("===========================================");
        //获取字符串
        System.out.println(port);

        User user = userService.selectUserById(1); 
        model.addAttribute("user", user);
        return "index";
        
    }


}