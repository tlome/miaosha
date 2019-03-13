package com.imooc.service.impl;

import com.imooc.mapper.UserMapper;
import com.imooc.model.User;
import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tl on 2019/3/3.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getById(int id) {
        return userMapper.selectById(id);
    }
}
