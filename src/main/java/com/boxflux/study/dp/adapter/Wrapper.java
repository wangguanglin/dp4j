package com.boxflux.study.dp.adapter;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is wrapper method!");
    }
}
