package com.course.cases;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import com.course.config.TestConfig;
import com.course.model.AddUserCase;
import com.course.model.GetUserInfoCase;
import com.course.utils.DatabaseUtil;

public class GetUserInfoTest {
    @Test(dependsOnGroups = "loginTrue", description = "获取用户id为1的用户信息")
    public void getUserInfo() throws IOException {
        SqlSession SqlSession = DatabaseUtil.getSqlSession();
        GetUserInfoCase getUserInfoCase = SqlSession.selectOne("getUserInfoCase", 1);
        System.out.println(getUserInfoCase.toString());
        System.out.println(TestConfig.getUserInfoUrl);
    }
}
