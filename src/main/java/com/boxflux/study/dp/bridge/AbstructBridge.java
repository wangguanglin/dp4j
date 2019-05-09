package com.boxflux.study.dp.bridge;

/**
 * Created by wangguanglin on 2019/5/7.
 */
public abstract class AbstructBridge {
    private Sourceable source;

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

    public void method(){
        source.method();
    }
}
