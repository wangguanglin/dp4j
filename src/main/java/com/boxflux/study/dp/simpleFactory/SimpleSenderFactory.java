package com.boxflux.study.dp.simpleFactory;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class SimpleSenderFactory {

    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SMSSender();
        }else{
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
