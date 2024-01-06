package com.sunmk.dormitory.controller;

import com.sunmk.dormitory.UserMapper.UserMapper;
import com.sunmk.dormitory.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * com.sunmk.dormitory.controller
 *
 * @author: wwt
 * @Description TODO
 * @Date 2024/1/5 14:48
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/")
    public List<User> index(){
        return userMapper.findAll();
    }

}
