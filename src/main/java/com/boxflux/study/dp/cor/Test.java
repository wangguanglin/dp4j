package com.boxflux.study.dp.cor;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public class Test {

    public static void main(String[] args){
        MyHandler h1 = new MyHandler("H1");
        MyHandler h2 = new MyHandler("H2");
        MyHandler h3 = new MyHandler("H3");
        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
    }
}
