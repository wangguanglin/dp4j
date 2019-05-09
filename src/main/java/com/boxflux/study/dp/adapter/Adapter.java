package com.boxflux.study.dp.adapter;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is original method!");
    }
}
