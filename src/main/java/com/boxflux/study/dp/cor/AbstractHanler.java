package com.boxflux.study.dp.cor;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public abstract class AbstractHanler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
