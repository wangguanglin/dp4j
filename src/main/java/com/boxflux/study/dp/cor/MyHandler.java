package com.boxflux.study.dp.cor;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public class MyHandler extends AbstractHanler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + " deal");
        if(this.getHandler()!=null)
            this.getHandler().operator();
    }
}
