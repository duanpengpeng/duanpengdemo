package com.example.lianxi01_1.View;

/**
 * Created by 朋 on 2018/5/8.
 */

public interface LoginView {
    //登录成功的回调
    void showLoginSuccess();
    //登录失败的回调
    void showLoginError(String error);
    //获取输入的手机号
    String getMobile();
    //获取输入的密码
    String getPassword();
}
