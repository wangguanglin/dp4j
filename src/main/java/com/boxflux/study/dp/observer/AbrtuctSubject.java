package com.boxflux.study.dp.observer;

import java.util.Vector;

/**
 * Created by wangguanglin on 2019/5/9.
 */
public abstract class AbrtuctSubject implements Subject{

    Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void addOberver(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : vector){
            observer.update();
        }
    }
}
