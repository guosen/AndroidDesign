package com.baseapp.sen.androiddesign.state;

import android.util.Log;

import com.baseapp.sen.androiddesign.MainActivity;

/**
 * Created by shouwang on 16/12/29.
 */

public class TvController {
    //开机状态
    private final static int POWER_ON=1;


    private final static int POWER_OFF=0;

    private int mState = POWER_OFF;

    public void powerOn(){
        mState = POWER_ON;

        if(mState == POWER_OFF){
            Log.i(MainActivity.TAG,"TV off->on");
        }
    }


    public void nextChannel(){
        if(mState == POWER_ON){
            Log.i(MainActivity.TAG,"TV ->next channel");
        } else {
            Log.i(MainActivity.TAG,"TV not on");
        }
    }
}
