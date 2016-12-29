package com.baseapp.sen.androiddesign.Factory;

import android.util.Log;

import com.baseapp.sen.androiddesign.MainActivity;

/**
 * Created by shouwang on 16/12/29.
 */

public class ConcreteProtuctA extends Product {
    @Override
    public void method() {
        Log.i(MainActivity.TAG,"this is product A");
    }
}
