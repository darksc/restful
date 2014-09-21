package com.hdsx.restful.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hdsx.restful.dao.UserMapper;
import com.hdsx.restful.models.User;
import com.hdsx.restful.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

}
