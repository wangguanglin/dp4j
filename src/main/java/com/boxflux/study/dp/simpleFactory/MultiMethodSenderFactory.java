package com.boxflux.study.dp.simpleFactory;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class MultiMethodSenderFactory {

    public Sender mailSender(){
        return new MailSender();
    }

    public Sender SmsSender(){
        return new SMSSender();
    }
}
