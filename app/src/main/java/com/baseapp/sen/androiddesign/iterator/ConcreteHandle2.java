package com.baseapp.sen.androiddesign.iterator;

import android.util.Log;

import com.baseapp.sen.androiddesign.MainActivity;

/**
 * Created by shouwang on 16/12/29.
 */

public class ConcreteHandle2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if(condition.equals("ConcreteHandle2")){
            Log.i(MainActivity.TAG,"ConcreteHandle2 handle");
            return;
        }else {
            successor.handleRequest(condition);
        }
    }
}
