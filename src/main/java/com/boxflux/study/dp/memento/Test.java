package com.boxflux.study.dp.memento;

/**
 * Created by wangguanglin on 2019/5/11.
 */
public class Test {
    public static void main(String[] args) {
        Original original = new Original("egg");
        Memento memento= original.createMemento();
        Storage storage = new Storage(memento);
        System.out.println("original value:"+original.getValue());
        original.setValue("chicken");
        System.out.println("original value:"+original.getValue());

        original.restoreMemento(storage.getMemento());
        System.out.println("original value:"+original.getValue());
    }
}
