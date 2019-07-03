package com.boxflux.study.dp.decorator;

import java.io.FileInputStream;

/**
 * Created by wangguanglin on 2019/5/7.
 */
public class AfterDecortor extends Decortor {
    public AfterDecortor(Sourceable source) {
        super(source);
    }

    @Override
    public void method() {
        super.method();
        after();
    }
    private void after(){
        System.out.println("this is after method");
    }
}
