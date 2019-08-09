package com.monkeyc;


import com.monkeyc.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/***
 * using API
 *   * SqlSessionFactory
 *   * SqlSession
 */

public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void testInit(){
        String file = "sqlMapConfig.xml";
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream(file);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void testQueryUserById(){
        SqlSession  sqlSession = sqlSessionFactory.openSession();
        try {
            /**
             * parameter 1: string : namespace+statementID
             * parameter 2: object : input_value
             */
            User user = sqlSession.selectOne("test.queryUserById",5);
            System.out.println(user);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            sqlSession.close();//similar Connection
        }
    }
    @Test
    public void testQueryUserByName(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try{
            List<User> userList = sqlSession.selectList("test.queryUserByName","%mon%");
            System.out.println(userList);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

}
