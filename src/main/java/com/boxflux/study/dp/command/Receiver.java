package com.boxflux.study.dp.command;

/**
 * 接受者，负责执行命令
 * Created by wangguanglin on 2019/5/11.
 */
public class Receiver {

    public void action(){
        System.out.println("Received and executed!");
    }
}
