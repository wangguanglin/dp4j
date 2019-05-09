package com.boxflux.study.dp.observer;

/**
 * Created by wangguanglin on 2019/5/9.
 */
public class MySubject extends AbrtuctSubject {
    @Override
    public void operation() {
        System.out.println("update myself!");
        notifyObservers();
    }
}
