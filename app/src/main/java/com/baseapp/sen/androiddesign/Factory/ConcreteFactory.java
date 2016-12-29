package com.baseapp.sen.androiddesign.Factory;

/**
 * Created by shouwang on 16/12/29.
 */

public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProtuctA();
    }

    @Override
    public <T extends Product> T createProductTo(Class<T> clz) {
        Product p=null;
        try {
            p=(Product)Class.forName(clz.getName()).newInstance();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return (T)p;
    }
}
