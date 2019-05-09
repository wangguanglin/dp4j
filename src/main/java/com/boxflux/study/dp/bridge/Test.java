package com.boxflux.study.dp.bridge;

/**
 * Created by wangguanglin on 2019/5/7.
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        AbstructBridge bridge = new MyBridge();
        Sourceable source1 = (Sourceable) (Class.forName("com.boxflux.study.dp.bridge.SubSource1").newInstance());
        Sourceable source2 = (Sourceable) (Class.forName("com.boxflux.study.dp.bridge.SubSource12").newInstance());
        bridge.setSource(source1);
        bridge.method();

        bridge.setSource(source2);
        bridge.method();
    }
}
