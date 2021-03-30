package com.baidu.xly.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.baidu.xly.helloworld.domain.User;
import com.baidu.xly.helloworld.service.UserService;

@Controller
public class HelloworldController {

    @Autowired 
    private UserService userService; 

    @RequestMapping("/")
    public String index(Model model) {
        User user = userService.selectUserById(1); 
        model.addAttribute("user", user);
        return "index";
        
    }


}