package com.boxflux.study.dp.templateMethod;

/**
 * Created by wangguanglin on 2019/5/8.
 */
public abstract class AbstructCalculator {

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }

    public final int calculate(String exp,String pot){
        int[] ints = split(exp,pot);
        return calculate(ints[0],ints[1]);
    }

    abstract public int calculate(int a,int b);
}
