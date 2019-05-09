package com.boxflux.study.dp.factoryMethod;

import com.boxflux.study.dp.simpleFactory.Sender;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class Test {

    public static void main(String... args){
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();

        sender.send("caonima");
    }
}
