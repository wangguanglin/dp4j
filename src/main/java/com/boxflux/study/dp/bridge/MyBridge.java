package com.boxflux.study.dp.bridge;

/**
 * Created by wangguanglin on 2019/5/7.
 */
public class MyBridge extends AbstructBridge {

    @Override
    public void method() {
        getSource().method();
    }
}
