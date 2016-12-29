package com.baseapp.sen.androiddesign.singleton;

/**
 * Created by shouwang on 16/12/28.
 * DCL 方式
 */

public class SingletonB {
    private static SingletonB sSingletonB=null;
    private SingletonB(){

    }
    public void doSomething(){}
    public static  SingletonB getInstance(){
        if(sSingletonB==null){
            synchronized (SingletonB.class){
                if (sSingletonB==null){
                    sSingletonB=new SingletonB();
                }
            }
        }

        return sSingletonB;
    }
}
