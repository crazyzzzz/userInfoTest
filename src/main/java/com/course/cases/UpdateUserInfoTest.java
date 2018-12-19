package com.course.cases;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import com.course.config.TestConfig;
import com.course.model.AddUserCase;
import com.course.model.UpdateUserInfoCase;
import com.course.utils.DatabaseUtil;

public class UpdateUserInfoTest {
    @Test(dependsOnGroups = "loginTrue", description = "更改用户信息")
    public void updateUserInfo() throws IOException {
        SqlSession SqlSession = DatabaseUtil.getSqlSession();
        UpdateUserInfoCase updateUserInfoCase = SqlSession.selectOne("updateUserInfoCase", 1);
        System.out.println(updateUserInfoCase.toString());
        System.out.println(TestConfig.updateUserInfoUrl);
    }
    
    @Test(dependsOnGroups = "loginTrue", description = "删除用户信息")
    public void deleteUserInfo() throws IOException {
        SqlSession SqlSession = DatabaseUtil.getSqlSession();
        UpdateUserInfoCase updateUserInfoCase = SqlSession.selectOne("updateUserInfoCase", 2);
        System.out.println(updateUserInfoCase.toString());
        System.out.println(TestConfig.updateUserInfoUrl);
    }
}
