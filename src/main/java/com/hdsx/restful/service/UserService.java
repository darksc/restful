package com.hdsx.restful.service;

import java.util.List;

import com.hdsx.restful.models.User;

public interface UserService {
    public User getUserById(Integer Id);

    public void insertUsers(List<User> users);
}
