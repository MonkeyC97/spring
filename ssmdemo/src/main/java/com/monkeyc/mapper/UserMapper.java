package com.monkeyc.mapper;

import com.monkeyc.po.User;
import java.util.List;

public interface UserMapper {

    public List<User> queryUserList() throws Exception;
    public void deleteUserById(User user) throws  Exception;
    //根据ID查
    //根据名称查
    //删除
    //修改
    //插入

}
