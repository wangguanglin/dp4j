package com.boxflux.study.dp.iterator;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public class MyIterator<T> implements Iterator {
    private Collection<T> collection;
    private int pos = -1;

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public T previous() {
        if(pos>0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public T next() {
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public T getFirst() {
        pos = 0;
        return collection.get(pos);
    }
}
