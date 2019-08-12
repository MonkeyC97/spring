package com.monkeyc.service;

import com.monkeyc.mapper.UserMapper;
import com.monkeyc.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> queryUserService() throws Exception {
        return userMapper.queryUserList();
    }

    @Override
    public void deleteUserById(User user) throws Exception {
        userMapper.deleteUserById(user);
    }


}
