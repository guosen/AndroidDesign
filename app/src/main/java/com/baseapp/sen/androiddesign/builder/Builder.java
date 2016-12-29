package com.baseapp.sen.androiddesign.builder;

/**
 * Created by shouwang on 16/12/28.
 */

public abstract class Builder {

    public  abstract void builderBoard(String board);

    public abstract  void buildDisplay(String display);

    public abstract  void  buildOs();

    public abstract  Computer creat();
}
