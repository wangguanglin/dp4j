package com.boxflux.study.dp.factoryMethod;

import com.boxflux.study.dp.simpleFactory.MailSender;
import com.boxflux.study.dp.simpleFactory.Sender;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
