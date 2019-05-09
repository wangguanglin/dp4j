package com.boxflux.study.dp.decorator;

/**
 * Created by wangguanglin on 2019/5/7.
 */
public class BeforeDecortor extends Decortor {
    public BeforeDecortor(Sourceable source) {
        super(source);
    }

    @Override
    public void method() {
        before();
        super.method();
    }

    private void before(){
        System.out.println("this is before method");
    }
}
