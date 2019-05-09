package com.boxflux.study.dp.decorator;

/**
 * Created by wangguanglin on 2019/5/7.
 */
public abstract  class Decortor implements Sourceable {

    private Sourceable source;

    public Decortor(Sourceable source) {
        this.source = source;
    }


    @Override
    public void method() {
        source.method();
    }
}
