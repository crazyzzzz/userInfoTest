package com.course.cases;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import com.course.config.TestConfig;
import com.course.model.AddUserCase;
import com.course.model.GetUserListCase;
import com.course.utils.DatabaseUtil;

public class GetUserListTest {
    @Test(dependsOnGroups = "loginTrue", description = "获取信息为男的用户信息")
    public void getUserList() throws IOException {
        SqlSession SqlSession = DatabaseUtil.getSqlSession();
        GetUserListCase getUserListCase = SqlSession.selectOne("getUserListCase", 1);
        System.out.println(getUserListCase.toString());
        System.out.println(TestConfig.getUserListUrl);
    }
}
