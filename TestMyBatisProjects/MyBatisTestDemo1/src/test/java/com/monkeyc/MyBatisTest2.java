package com.monkeyc;

import com.monkeyc.bz.UserBz;
import com.monkeyc.mapper.OrdersMapper;
import com.monkeyc.mapper.UserMapper;
import com.monkeyc.po.Orders;
import com.monkeyc.po.OrdersEx;
import com.monkeyc.po.User;
import com.monkeyc.po.UserEx;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyBatisTest2 {

    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void testInit(){
        String file = "sqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(file);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void testQueryOrderToUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
           OrdersMapper ordersMapper =  sqlSession.getMapper(OrdersMapper.class);
           List<OrdersEx> ordersExList =  ordersMapper.queryOrderToUser();
            System.out.println(ordersExList);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }

    @Test
    public void testQueryOrderToUser2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            OrdersMapper ordersMapper =  sqlSession.getMapper(OrdersMapper.class);
            List<Orders> ordersList =  ordersMapper.queryOrderToUser2();
            System.out.println(ordersList);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }

    @Test
    public void testQueryOrderToOrderdetail(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            OrdersMapper ordersMapper =  sqlSession.getMapper(OrdersMapper.class);
            List<Orders> ordersList =  ordersMapper.queryOrderToOrderdetail();
            System.out.println(ordersList);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }

    @Test
    public void testQueryOrderdetailToItems(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            OrdersMapper ordersMapper =  sqlSession.getMapper(OrdersMapper.class);
            List<Orders> ordersList =  ordersMapper.queryOrderToItems();
            System.out.println(ordersList);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }


    @Test
    public void testQueryUserToItems(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper =  sqlSession.getMapper(UserMapper.class);
            List<User> userList =  userMapper.queryUserToItems();
            System.out.println(userList);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{
            sqlSession.close();
        }
    }

}
