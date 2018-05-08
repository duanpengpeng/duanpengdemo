package com.example.lianxi01_1.Http;

/**
 * Created by 朋 on 2018/5/8.
 */

public interface OKHttpListener {
    //获取数据成功时回调
    void fromJosnSuccess(String json);

    //获取数据失败时回调
    void fromJsonError(String error);
}
