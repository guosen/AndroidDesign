package com.baseapp.sen.androiddesign.strategy;

/**
 * Created by shouwang on 16/12/29.
 */

public class BusStrategy implements CalculateSrategy{
    /**
     * 公交车
     *
     * 10公里内1块钱,超过10公里每加一块钱可以坐5公里
     * @param km
     * @return
     */
    @Override
    public int calcculatePrice(int km) {
        int extraTotal = km -10;

        int extractFactor = extraTotal/5;

        int fraction = extractFactor%5;

        int price = 1+extractFactor*1;
        return fraction>0?++price:price;
    }
}
