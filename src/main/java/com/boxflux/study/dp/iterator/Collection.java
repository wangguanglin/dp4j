package com.boxflux.study.dp.iterator;


/**
 * Created by wangguanglin on 2019/5/11.
 */
public interface Collection<T> {

    Iterator<T> iterator();

    /**
     * 获取集合元素
     * @param index
     * @return
     */
    T get(int index);

    /**
     * 获取集合个数
     * @return
     */
    int size();

}
