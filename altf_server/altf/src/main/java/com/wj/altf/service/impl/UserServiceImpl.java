package com.wj.altf.service.impl;

import com.wj.altf.dao.UserMapper;
import com.wj.altf.entity.User;
import com.wj.altf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
