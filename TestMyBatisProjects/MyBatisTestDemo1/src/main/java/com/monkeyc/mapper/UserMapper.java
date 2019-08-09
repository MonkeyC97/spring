package com.monkeyc.mapper;

import com.monkeyc.bz.UserBz;
import com.monkeyc.po.User;
import com.monkeyc.po.UserEx;

import java.util.List;

public interface UserMapper {

    public List<UserEx> queryUserZH(UserBz userBz) throws Exception;
    public int queryUserCount(UserBz userBz) throws Exception;
    public List<UserEx> queryUserByMoreIds(UserBz userBz) throws Exception;
    public List<User> queryUserByAlias() throws Exception;
    public List<User> queryUserByAlias2() throws Exception;
    public List<User> queryUserToItems() throws Exception;
}
