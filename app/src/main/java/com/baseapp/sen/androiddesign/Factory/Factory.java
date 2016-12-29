package com.baseapp.sen.androiddesign.Factory;

/**
 * Created by shouwang on 16/12/29.
 */

public abstract class Factory {
    /***
     * 抽象工厂方法
     * 具体产生什么类
     * 由子类去决定
     * @return 具体的产品对象
     */
    public abstract Product createProduct();

    /**
     * 采用传入类型的方式
     * @param clz
     * @param <T>
     * @return
     */
    public  abstract <T extends Product> T createProductTo(Class<T> clz);
}
