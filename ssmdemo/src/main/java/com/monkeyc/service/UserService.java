package com.monkeyc.service;

import com.monkeyc.po.User;

import java.util.List;

public interface UserService {

    public List<User> queryUserService() throws Exception;

    public void deleteUserById(User user) throws Exception;
}
