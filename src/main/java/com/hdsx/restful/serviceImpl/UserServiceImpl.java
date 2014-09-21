package com.hdsx.restful.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    @Override
    public void insertUsers(List<User> users) {
        for(int i = 0; i < users.size(); i++) {
            if(i<2){
                this.userMapper.insert(users.get(i));
            }
            else {
                throw new RuntimeException();
            }
        };
    }

}
