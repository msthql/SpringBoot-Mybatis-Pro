package com.demo.controller;


import com.demo.po.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findById/{id}")
    @ResponseBody
    public User findById(@PathVariable int id) {
        User user = userService.findByid(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping("/findAllUser")
    @ResponseBody
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

}
