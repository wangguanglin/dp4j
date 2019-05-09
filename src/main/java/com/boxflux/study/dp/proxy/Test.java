package com.boxflux.study.dp.proxy;

/**
 * Created by wangguanglin on 2019/5/7.
 */
public class Test {

    public static void main(String... args){
        Sourceable source = new Sourceable() {
            @Override
            public void method() {
                System.out.println("this is original method");
            }
        };

        Sourceable proxy = new SourceProxy(source);
        proxy.method();
    }
}
