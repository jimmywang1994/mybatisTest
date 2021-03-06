package com.ww.mybatis;


import com.ww.mybatis.mapper.UserMapper;
import com.ww.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

    @Test
    public void testMybatis() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //User user = sqlSession.selectOne("com.ww.mybatis.mapper.UserMapper.selectUser", 1);
        User user=(User)sqlSession.getMapper(UserMapper.class);
        System.out.println(user);
    }
}
