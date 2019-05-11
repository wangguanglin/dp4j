package com.boxflux.study.dp.iterator;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public class MyCollection implements Collection {
    public String string[] = {"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int index) {
        return string[index];
    }

    @Override
    public int size() {
        return string.length;
    }
}
