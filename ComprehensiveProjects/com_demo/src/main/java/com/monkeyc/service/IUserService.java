package com.monkeyc.service;

import com.monkeyc.po.User;

import java.util.List;

public interface IUserService {
        List<User> queryUserService() throws Exception;
}
