package com.boxflux.study.dp.adapter;

/**
 * Created by wangguanglin on 2019/5/7.
 */
public abstract class AbstructWrapper implements Sourceable {

    @Override
    public void method1() {
        System.out.println("this is wrapper method1");
    }

    @Override
    public void method2() {
        System.out.println("this is wrapper method2");
    }
}
