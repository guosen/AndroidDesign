package com.baseapp.sen.androiddesign.strategy;

/**
 * Created by shouwang on 16/12/29.
 */

public class TrafficCalculator {
    CalculateSrategy mCalculateSrategy;

    public void setCalculateSrategy(CalculateSrategy calculateSrategy){
        mCalculateSrategy = calculateSrategy;
    }

    public int calculatePrice(int km){
        return  mCalculateSrategy.calcculatePrice(km);
    }
}
