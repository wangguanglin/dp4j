package com.boxflux.study.dp.strategy;

/**
 * Created by wangguanglin on 2019/5/8.
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] ints = split(exp,"\\+");
        return ints[0]+ints[1];
    }
}
