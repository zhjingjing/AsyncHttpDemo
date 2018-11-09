package com.zj.asynchttp;

import android.support.multidex.MultiDexApplication;

/**
 * create by zj on 2018/11/9
 */
public  class App  extends MultiDexApplication {

    private static final String SP_NAME = "app_cache";
    private static App sApp;

    @Override
    public void onCreate() {
        super.onCreate();
        sApp=this;
    }

    public static App getInstance() {
        return sApp;
    }
}
