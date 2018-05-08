package com.example.lianxi01_1.Presenter;

import com.example.lianxi01_1.Http.HttpConfig;
import com.example.lianxi01_1.Model.LoginModel;
import com.example.lianxi01_1.Model.Loginlisttnter;
import com.example.lianxi01_1.Model.RegModel;
import com.example.lianxi01_1.Model.Reglisttnter;
import com.example.lianxi01_1.View.LoginView;
import com.example.lianxi01_1.View.RegView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 朋 on 2018/5/8.
 */

public class PresenterImpl implements Presenter{

    @Override
    public void getLoginJson(LoginModel iLoginModel, final LoginView iLoginView) {
        //创建Map集合
        Map<String, String> map = new HashMap<>();
        map.put("mobile", iLoginView.getMobile());
        map.put("password", iLoginView.getPassword());
        iLoginModel.showLogin(HttpConfig.login_url, map, new Loginlisttnter() {
            @Override
            public void showLoginJsonSuccess(String json) {
                //登录成功
                iLoginView.showLoginSuccess();
            }

            @Override
            public void showLoginJsonError(String error) {
                iLoginView.showLoginError(error);//登录失败
            }
        });
    }

    @Override
    public void getRegJson(RegModel iRegModel, final RegView iRegView) {
        //创建Map集合
        Map<String, String> map = new HashMap<>();
        map.put("mobile", iRegView.getMobile());
        map.put("password", iRegView.getPassword());
        iRegModel.showReg(HttpConfig.login_url, map, new Reglisttnter() {

            @Override
            public void showRegJsonSuccess(String json) {
                iRegView.showLoginSuccess(json);
            }

            @Override
            public void showRegJsonError(String error) {
                iRegView.showLoginError(error);
            }
        });
    }
}