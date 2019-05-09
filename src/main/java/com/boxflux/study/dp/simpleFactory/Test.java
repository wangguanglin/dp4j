package com.boxflux.study.dp.simpleFactory;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class Test {

    public static void main(String... args){
        Sender smsSender = new SimpleSenderFactory().produce("sms");
        Sender mialsender = new SimpleSenderFactory().produce("mail");

        smsSender.send("发短信");
        mialsender.send("发邮件");
    }
}
