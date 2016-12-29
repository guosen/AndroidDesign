package com.baseapp.sen.androiddesign.builder;

/**
 * Created by shouwang on 16/12/28.
 */

public class MacBookBuilder extends  Builder {

    private Computer mComputer=new MacBook();

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void builderBoard(String board) {
        mComputer.setBorad(board);
    }

    @Override
    public void buildOs() {
        mComputer.setOs();
    }

    @Override
    public Computer creat() {
        return mComputer;
    }
}
