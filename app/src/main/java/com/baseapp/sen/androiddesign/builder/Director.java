package com.baseapp.sen.androiddesign.builder;

/**
 * Created by shouwang on 16/12/28.
 */

public class Director {
    Builder mBuilder = null;

    public  Director(Builder builder){
        mBuilder=builder;
    }

    public  void construct(String board,String display){
        mBuilder.buildDisplay(display);
        mBuilder.builderBoard(board);
        mBuilder.buildOs();
    }


}
