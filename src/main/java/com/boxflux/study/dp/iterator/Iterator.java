package com.boxflux.study.dp.iterator;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public interface Iterator<T> {

    T previous();

    T next();

    boolean hasNext();

    T getFirst();
}
