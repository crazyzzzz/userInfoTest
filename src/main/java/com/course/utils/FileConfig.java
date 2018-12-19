package com.course.utils;

import java.util.Locale;
import java.util.ResourceBundle;

import com.course.model.InterfaceName;

public class FileConfig {
    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);

    public static String getUrl(InterfaceName name) {
        String address = bundle.getString("test.url");
        String url = "";
        String testUrl = "";
        if (name == InterfaceName.GETUSERLIST) {
            url = bundle.getString("getUserList.uri");
        }
        if (name == InterfaceName.LOGIN) {
            url = bundle.getString("login.uri");
        }
        if (name == InterfaceName.UPDATEUSERINFO) {
            url = bundle.getString("updateUserInfo.uri");
        }
        if (name == InterfaceName.GETUSERINFO) {
            url = bundle.getString("getUserInfo.uri");
        }
        if (name == InterfaceName.ADDUSERINFO) {
            url = bundle.getString("addUser.uri");
        }

        testUrl = address + url;
        return testUrl;
    }
}
