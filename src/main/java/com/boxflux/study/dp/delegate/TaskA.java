package com.boxflux.study.dp.delegate;

/**
 * Created by wangguanglin on 2019/5/15.
 */
public class TaskA implements Task {
    @Override
    public void doTask() {
        System.out.println("TaskA done!");
    }
}
