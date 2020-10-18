package com.demo.service;

import com.demo.mapper.UserMapper;
import com.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findByid(int id){
        System.out.println(id);
        return userMapper.findByid(id);
    }
    @Cacheable(value = "UserCache",key = "'user.findAllUsers'")
    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }
}
