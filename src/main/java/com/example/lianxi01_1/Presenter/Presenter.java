package com.example.lianxi01_1.Presenter;

import com.example.lianxi01_1.Model.LoginModel;
import com.example.lianxi01_1.Model.RegModel;
import com.example.lianxi01_1.View.LoginView;
import com.example.lianxi01_1.View.RegView;

/**
 * Created by 朋 on 2018/5/8.
 */

public interface Presenter {
    //登录的回调方法
    void getLoginJson(LoginModel iLoginModel, LoginView iLoginView);
    //注册的回调方法
    void getRegJson(RegModel iRegModel, RegView iRegView);
}
