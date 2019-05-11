package com.boxflux.study.dp.command;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public class Test {

    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}
