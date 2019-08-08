package com.monkeyc.dao;

import com.monkeyc.po.User;
import com.monkeyc.tools.DbManager;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserDAO {
    public List<User> queryUserDao(){
        List<User> userList = new ArrayList<>();
        try{
            String strSql = "select * from user";
            ResultSet rs= new DbManager().queryExecute(strSql);
            while(rs.next()){
                User user = new User();
                user.setUserId(rs.getInt("userId"));
                user.setUserName(rs.getString("username"));
                user.setUserAddr(rs.getString("userAddr"));
                userList.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }

}
