package com.boxflux.study.dp.observer;

/**
 * Created by wangguanglin on 2019/5/9.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("Oberver 1 has received");
    }
}
