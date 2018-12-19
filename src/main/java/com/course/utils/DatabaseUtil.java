package com.course.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DatabaseUtil {

    public static SqlSession  getSqlSession() throws IOException {
        //获取配置的资源文件
        Reader reader = Resources.getResourceAsReader("databaseConfig.xml");
        //得到SqlSeeionFactory，使用类加载器加载xml
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        //得到sqlsession对象，可以执行sql语句了
        SqlSession session =factory.openSession();
        return session;
        
    }
}
