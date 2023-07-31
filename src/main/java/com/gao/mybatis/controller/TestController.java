package com.gao.mybatis.controller;

import com.gao.mybatis.pojo.User;
import com.gao.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public List<User> findAllUser() {
        List<User> allUser = userService.findAllUser();
        return allUser;
    }
}
