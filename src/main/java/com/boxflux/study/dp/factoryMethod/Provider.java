package com.boxflux.study.dp.factoryMethod;

import com.boxflux.study.dp.simpleFactory.Sender;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public interface Provider {

    Sender produce();

}
