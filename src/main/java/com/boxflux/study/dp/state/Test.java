package com.boxflux.study.dp.state;

/**
 * Created by wangguanglin on 2019/5/15.
 */
public class Test {

    public static void main(String... args){
        State state = new State();
        Context context = new Context(state);

        state.setValue("state1");
        context.method();

        state.setValue("state2");
        context.method();
    }
}
