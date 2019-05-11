package com.boxflux.study.dp.command;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
