package com.zj.asynchttp.network;

import com.zj.asynchttp.BuildConfig;
/**
 * create by zj on 2018/11/9
 */
public class ServerInfo {

    public interface   ServerHost{
        String DEVELOPMENT="http://cexpress.market.alicloudapi.com/";
        String ONLINE="http://cexpress.market.alicloudapi.com/";

        String DEVELOPMENT_APPCODE="46b112835f144e3789897b4949247550";
        String ONLINE_APPCODE="46b112835f144e3789897b4949247550";
    }


    public static String getServerAddress(){
        if (BuildConfig.DEBUG){
            return ServerHost.DEVELOPMENT;
        }else{
            return ServerHost.ONLINE;
        }
    }

    public static String getAppCode(){
        if (BuildConfig.DEBUG){
            return ServerHost.DEVELOPMENT_APPCODE;
        }else{
            return ServerHost.ONLINE_APPCODE;
        }
    }
}
