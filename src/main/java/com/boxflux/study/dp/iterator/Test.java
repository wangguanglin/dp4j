package com.boxflux.study.dp.iterator;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public class Test {

    public static void main(String... args){
        Collection c = new MyCollection();
        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
