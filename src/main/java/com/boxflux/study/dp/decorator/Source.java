package com.boxflux.study.dp.decorator;

/**
 * Created by wangguanglin on 2019/5/7.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this source");
    }
}
