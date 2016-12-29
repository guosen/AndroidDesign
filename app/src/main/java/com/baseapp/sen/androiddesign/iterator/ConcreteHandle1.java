package com.baseapp.sen.androiddesign.iterator;

import android.util.Log;

import com.baseapp.sen.androiddesign.MainActivity;

/**
 * Created by shouwang on 16/12/29.
 */

public class ConcreteHandle1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if(condition.equals("ConcreteHandle1")){
            Log.i(MainActivity.TAG,"ConcreteHandle1 handle");
            return;
        }else {
            successor.handleRequest(condition);
        }
    }
}
