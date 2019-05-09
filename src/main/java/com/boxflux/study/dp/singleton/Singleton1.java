package com.boxflux.study.dp.singleton;

import com.boxflux.study.dp.simpleFactory.MailSender;
import com.boxflux.study.dp.simpleFactory.Sender;

/**
 * Created by wangguanglin on 2019/5/6.
 * 线程不安全
 */
public class Singleton1 {

    private Sender instance;

    public Sender getInstance(){
        if(null == instance){
            instance = new MailSender();
        }
        return instance;
    }
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
