package com.example.lianxi01_1.Model;

/**
 * Created by 朋 on 2018/5/8.
 */

public interface Loginlisttnter {
    //获取数据成功
    void showLoginJsonSuccess(String json);
    //获取数据失败
    void showLoginJsonError(String error);
}
