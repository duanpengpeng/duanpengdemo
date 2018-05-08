package com.example.lianxi01_1.Model;

import com.example.lianxi01_1.Bean.LoginBean;
import com.example.lianxi01_1.Http.HttpUtils;
import com.example.lianxi01_1.Http.OKHttpListener;
import com.google.gson.Gson;

import java.util.Map;

/**
 * Created by 朋 on 2018/5/8.
 */

public class LoginModelIpml implements LoginModel{
    @Override
    public void showLogin(String url, Map<String, String> map, final Loginlisttnter iLoginlisttnter) {
        //在Model层进行网络请求
        HttpUtils httputils = HttpUtils.getHttputils();
        //使用POST方式进行请求
        httputils.postOkHttp(url, map);
        httputils.setFromHttpListener(new OKHttpListener() {
            @Override
            public void fromJosnSuccess(String json) {
                //请求成功
                //进行解析
                Gson gson = new Gson();
                LoginBean loginBean = gson.fromJson(json, LoginBean.class);
                String code = loginBean.getCode();
                if (code.equals("0")) {//判断当code等于0时为登录成功 否则为登录失败
                    iLoginlisttnter.showLoginJsonSuccess(loginBean.getMsg());
                }else {
                    //请求失败  code不为0
                    iLoginlisttnter.showLoginJsonError(loginBean.getMsg());
                }
            }

            @Override
            public void fromJsonError(String error) {
                //请求失败
                iLoginlisttnter.showLoginJsonError(error);
            }
        });

    }
}
