package com.baseapp.sen.androiddesign.cloneable;

import java.util.ArrayList;

/**
 * Created by shouwang on 16/12/29.
 * <p>
 * 原型模式
 * Android中
 *
 * @Override public Object clone() {
 * try {
 * ArrayList<?> result = (ArrayList<?>) super.clone();
 * result.array = array.clone();
 * return result;
 * } catch (CloneNotSupportedException e) {
 * throw new AssertionError();
 * }
 * }
 */

public class WordDocument implements Cloneable {
    //文本
    private String mText;

    //图片名列表
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
    }

    @Override
    protected WordDocument clone() throws CloneNotSupportedException {
        try {
            WordDocument document = (WordDocument) super.clone();
            document.mText = this.mText;
            document.mImages = this.mImages;
            return document;
        } catch (Exception ex) {

        }
        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;

    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void setImages(ArrayList images) {
        this.mImages = images;
    }
}
