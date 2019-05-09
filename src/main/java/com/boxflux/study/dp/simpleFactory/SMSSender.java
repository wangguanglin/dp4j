package com.boxflux.study.dp.simpleFactory;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class SMSSender implements Sender {
    @Override
    public void send(String content) {
        System.out.println("SMS send : "+content);
    }
}
