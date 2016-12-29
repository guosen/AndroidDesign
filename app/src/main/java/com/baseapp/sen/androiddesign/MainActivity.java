package com.baseapp.sen.androiddesign;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.baseapp.sen.androiddesign.Factory.ConcreteFactory;
import com.baseapp.sen.androiddesign.Factory.ConcreteProductB;
import com.baseapp.sen.androiddesign.Factory.Factory;
import com.baseapp.sen.androiddesign.Factory.Product;
import com.baseapp.sen.androiddesign.iterator.ConcreteHandle1;
import com.baseapp.sen.androiddesign.iterator.ConcreteHandle2;
import com.baseapp.sen.androiddesign.state.TvController;
import com.baseapp.sen.androiddesign.strategy.BusStrategy;
import com.baseapp.sen.androiddesign.strategy.TrafficCalculator;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="dsign";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //BUilder 模式

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("dialog");
        builder.setMessage("msg");
        builder.create().show();
        //工厂模式
       // 1

        Factory factory = new ConcreteFactory();
        Product p=factory.createProduct();
        p.method();
        //2

        Factory factory1 =new ConcreteFactory();
        Product p2=factory.createProductTo(ConcreteProductB.class);
        p2.method();;

     //策略模式
        TrafficCalculator calculator =new TrafficCalculator();
        calculator.setCalculateSrategy(new BusStrategy());
        Log.i(TAG,"公交车16公里价格"+calculator.calculatePrice(16));

     //状态模式

        TvController tvController=new TvController();
        tvController.powerOn();
        tvController.nextChannel();

      //责任链模式
        ConcreteHandle1 handle1 = new ConcreteHandle1();

        ConcreteHandle2 handle2 = new ConcreteHandle2();

        handle1.successor=handle2;
        handle2.successor=handle1;
        handle1.handleRequest("ConcreteHandle1");

    }
}
