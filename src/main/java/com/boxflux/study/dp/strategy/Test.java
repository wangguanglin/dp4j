package com.boxflux.study.dp.strategy;

/**
 * Created by wangguanglin on 2019/5/8.
 */
public class Test {
    public static void main(String... args) {
        ICalculator calculator = new Plus();
        System.out.println(calculator.calculate("5+9"));
        System.out.println(new Minus().calculate("5-9"));
    }
}
