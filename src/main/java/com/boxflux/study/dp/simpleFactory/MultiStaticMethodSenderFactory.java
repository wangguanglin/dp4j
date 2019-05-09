package com.boxflux.study.dp.simpleFactory;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class MultiStaticMethodSenderFactory {

    public static Sender mailSender(){
        return new SMSSender();
    }

    public static Sender smsSender(){
        return new MailSender();
    }
}
