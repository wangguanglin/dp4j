package com.boxflux.study.dp.memento;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
