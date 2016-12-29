package com.baseapp.sen.androiddesign.singleton;

/**
 * Created by shouwang on 16/12/28.
 */

public class SingletonC {

    public SingletonC() {

    }

    public static SingletonC getInstance() {
        return SingletonHolder.sInstance;
    }

    /***
     *静态内部类
     */
    private static class SingletonHolder {
        private static final SingletonC sInstance = new SingletonC();
    }
}
