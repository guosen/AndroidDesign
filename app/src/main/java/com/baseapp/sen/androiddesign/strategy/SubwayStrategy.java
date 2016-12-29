package com.baseapp.sen.androiddesign.strategy;

/**
 * Created by shouwang on 16/12/29.
 */

public class SubwayStrategy implements CalculateSrategy {
    /**
     * 地铁价格
     * @param km
     * @return
     */
    @Override
    public int calcculatePrice(int km) {


        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        }
        return 7;
    }
}
