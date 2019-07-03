package com.boxflux.study.dp.decorator;

/**
 * Created by wangguanglin on 2019/5/17.
 */
public class Test {
    public static void main(String[] args) {
        new BeforeDecortor(new AfterDecortor(new Source())).method();
    }
}
