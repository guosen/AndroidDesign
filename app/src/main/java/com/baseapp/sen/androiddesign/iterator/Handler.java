package com.baseapp.sen.androiddesign.iterator;

/**
 * Created by shouwang on 16/12/29.
 * 责任链模式
 */

public abstract class Handler {
    public   Handler successor;
    /**
     * 请求条件
     * @param condition 条件
     */

    public abstract void handleRequest(String condition);
}
