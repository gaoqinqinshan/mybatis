package com.gao.mybatis.service;

import com.gao.mybatis.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService  {
    public List<User> findAllUser();
}
