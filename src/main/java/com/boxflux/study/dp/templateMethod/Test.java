package com.boxflux.study.dp.templateMethod;

/**
 * Created by wangguanglin on 2019/5/8.
 */
public class Test {

    public static void main(String[] args){
        AbstructCalculator calculator = new Plus();

        System.out.println(calculator.calculate("2+9","\\+"));
    }
}
