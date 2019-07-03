package com.boxflux.study.dp.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangguanglin on 2019/5/15.
 */
public class Delegator implements Task {

    private Map<String,Task> targets = new HashMap<String,Task>();

    public Delegator() {
        targets.put("login",new TaskA());
        targets.put("pass",new TaskB());
    }

    @Override
    public void doTask() {
        targets.get("login").doTask();
    }
}
