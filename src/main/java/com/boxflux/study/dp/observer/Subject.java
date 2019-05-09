package com.boxflux.study.dp.observer;

/**
 * Created by wangguanglin on 2019/5/9.
 */
public interface Subject {
    void addOberver(Observer observer);
    void del(Observer observer);
    void notifyObservers();

    void operation();
}
