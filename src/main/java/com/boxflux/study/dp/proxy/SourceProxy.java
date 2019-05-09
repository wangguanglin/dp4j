package com.boxflux.study.dp.proxy;

/**
 * Created by wangguanglin on 2019/5/7.
 */
public class SourceProxy implements Sourceable {
    private Sourceable source;

    public SourceProxy(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before(){
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");
    }
}
