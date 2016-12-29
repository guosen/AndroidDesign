package com.baseapp.sen.androiddesign.abtract;

/**
 * Created by shouwang on 16/12/29.
 */

public class ConcreteFactory1 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }
}
