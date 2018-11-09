package com.zj.asynchttp.network;

import com.loopj.android.http.RequestHandle;
import com.loopj.android.http.RequestParams;

/**
 * create by zj on 2018/11/9
 */
public class ExpressApi {

    public static RequestHandle getExpressInfo(String orderId,String type,ResponseHandler responseHandler){
        RequestParams requestParams=new RequestParams();
        requestParams.put("no",orderId);
        requestParams.put("type",type);
        return HttpClient.doGet("cexpress",requestParams,responseHandler);
    }
}
