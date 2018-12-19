package com.course.cases;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.course.config.TestConfig;
import com.course.model.InterfaceName;
import com.course.model.LoginCase;
import com.course.utils.DatabaseUtil;
import com.course.utils.FileConfig;

public class LoginTest {

    @BeforeTest(groups="loginTrue",description="测试准备工作，获取httpclient对象")
    public void beforeTest() {
        System.out.println("beforeTest----------开始");
        //初始化HttpClient
       TestConfig.defaultHttpClient  = new DefaultHttpClient();
       TestConfig.loginUrl =FileConfig.getUrl(InterfaceName.LOGIN);
       TestConfig.updateUserInfoUrl =FileConfig.getUrl(InterfaceName.UPDATEUSERINFO);
       TestConfig.getUserListUrl =FileConfig.getUrl(InterfaceName.GETUSERLIST);
       TestConfig.getUserInfoUrl =FileConfig.getUrl(InterfaceName.GETUSERINFO);
       TestConfig.addUserUrl =FileConfig.getUrl(InterfaceName.LOGIN);
       System.out.println("beforeTest----------完成");
    }
    
    @Test(groups="loginTrue",description="用户登录成功接口测试")
    public void loginTrue() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSession();
        LoginCase loginCase = session.selectOne("loginCase",1);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);
    }
    @Test(groups="loginFalse",description="用户登录失败接口测试")
    public void loginFalse() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSession();
        LoginCase loginCase = session.selectOne("loginCase",2);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);
    }
}
