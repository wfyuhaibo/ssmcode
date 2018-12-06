package com.ssmcode.service.impl;

import com.ssmcode.mapper.UserMapper;
import com.ssmcode.pojo.User;
import com.ssmcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {


        return userMapper.selectByPrimaryKey(id);
    }
}
