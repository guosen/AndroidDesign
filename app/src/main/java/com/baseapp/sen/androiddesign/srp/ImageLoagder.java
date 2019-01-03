package com.baseapp.sen.androiddesign.srp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.widget.ImageView;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <pre>
 *     author : guosenlin
 *     e-mail : guosenlin91@gmail.com
 *     time   : 2019/01/03
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class ImageLoagder {

    //图片缓存
    LruCache<String ,Bitmap> mImageLoaderCache;

    ExecutorService mEcecutor ;
    Handler mUiHandler = new Handler(Looper.getMainLooper());
    public ImageLoagder(){

        initImageLoaderCache();
    }

    private void initImageLoaderCache(){
        final int maxCache = (int)(Runtime.getRuntime().maxMemory()/1024);
        final int cacheSize = maxCache/4;
        mImageLoaderCache = new LruCache<String, Bitmap>(cacheSize){
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes()* value.getHeight()/1024;
            }
        };
    }

    public void displayImage(final String url, final ImageView imageView){
        imageView.setTag(url);
        mEcecutor.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downLoadImage(url);
                if (bitmap == null)
                {
                    return;
                }
                if (imageView.getTag().equals(url)){
                    updateImageView(imageView,bitmap);
                }
            }
        });
    }

    private void updateImageView(final ImageView imageView,final Bitmap bitmap){

        mUiHandler.post(new Runnable() {
            @Override
            public void run() {
                imageView.setImageBitmap(bitmap);
            }
        });

    }
    public Bitmap downLoadImage(String imageUrl){
        Bitmap bitmap = null;
        try{
            URL url = new URL(imageUrl);
            final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
        }catch (Exception ex){

        }
        return bitmap;
    }
}
