package com.boxflux.study.dp.singleton;

import com.boxflux.study.dp.simpleFactory.MailSender;
import com.boxflux.study.dp.simpleFactory.Sender;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class Singleton2 {
    private static Sender instance = null;

    public static synchronized Sender getInstance() {
        if(instance == null){
            instance = new MailSender();
        }
        return instance;
    }

    public static Sender getInstance1() {
        if(null == instance){
            synchronized (instance){
                if(null == instance){
                    instance = new MailSender();
                }
            }
        }
        return instance;
    }


    public static synchronized void init(){
        if(null == instance){
            instance = new MailSender();
        }
    }

    public static Sender getInstance2(){
        if(null == instance){
            init();
        }
        return instance;
    }
}
