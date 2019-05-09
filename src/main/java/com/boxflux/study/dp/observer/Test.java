package com.boxflux.study.dp.observer;

/**
 * Created by wangguanglin on 2019/5/9.
 */
public class Test {

    public static void main(String... args){
        MySubject mySubject = new MySubject();

        mySubject.addOberver(new Observer1());
        mySubject.addOberver(new Observer2());

        mySubject.operation();
    }
}
