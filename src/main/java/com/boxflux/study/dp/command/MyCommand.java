package com.boxflux.study.dp.command;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
