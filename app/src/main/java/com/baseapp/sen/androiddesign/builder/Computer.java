package com.baseapp.sen.androiddesign.builder;

/**
 * Created by shouwang on 16/12/28.
 */

public abstract class Computer {
    protected  String mBorad;

    protected  String mDisplay;

    protected  String mOs;

    protected Computer(){

    }

    public  void setBorad(String borad){
        this.mBorad=borad;
    }

    public void setDisplay(String display){
        this.mDisplay=display;
    }

    protected abstract void setOs();

    @Override
    public String toString() {
        return "COmputer [mborder="+mBorad+"]";
    }
}
