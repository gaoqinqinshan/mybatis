package com.gao.mybatis.service.impl;

import com.gao.mybatis.mapper.UserMapper;
import com.gao.mybatis.pojo.User;
import com.gao.mybatis.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        List<User> allUser = userMapper.findAllUser();
        return allUser;
    }


//    public List<User> findAllUser() {
//        List<User> allUser = userMapper.findAllUser();
//        return allUser;
//    }
}
