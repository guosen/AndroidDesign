package com.baseapp.sen.androiddesign.singleton;

/**
 * Created by shouwang on 16/12/28.
 * 懒汉模式
 * 优点 使用时才实例化
 */

public class SingletonA {
    private static SingletonA instance;

    public SingletonA() {

    }

    /***
     * 多线程情况下保证
     * @return
     */
    public static synchronized SingletonA getInstance() {
        if (instance == null) {
            instance = new SingletonA();
        }
        return instance;
    }
}
