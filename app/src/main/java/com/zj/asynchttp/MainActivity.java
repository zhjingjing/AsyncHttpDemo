package com.zj.asynchttp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestHandle;
import com.loopj.android.http.TextHttpResponseHandler;
import com.zj.asynchttp.adapter.ProcessAdapter;
import com.zj.asynchttp.bean.CourierBean;
import com.zj.asynchttp.databinding.ActivityMainBinding;
import com.zj.asynchttp.network.ExpressApi;
import com.zj.asynchttp.network.ResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ProcessAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil. setContentView(this,R.layout.activity_main);
        binding.setPresenter(this);
        binding.processList.setHasFixedSize(true);
        binding.processList.setLayoutManager(new LinearLayoutManager(this));
        adapter=new ProcessAdapter(this);
        binding.processList.setAdapter(adapter);
    }


    public void doConfirm(){
        String orderId=binding.editOrderId.getText().toString();
        if (TextUtils.isEmpty(orderId)){
            Toast.makeText(this,"请输入订单号",Toast.LENGTH_SHORT).show();
            return;
        }

        RequestHandle requestHandle= ExpressApi.getExpressInfo(orderId, "", new ResponseHandler<CourierBean>() {

            @Override
            public void onSuccess(CourierBean result) {

                if (result!=null){
                    String text="订单号：";
                    text+=(result.no+"\n");
                    text+=("快递公司名称："+result.name+"\n");
                    text+=("快递电话："+result.phone);
                    binding.tvResult.setText(text);
                    adapter.setData(result.list);

                }else{
                    Toast.makeText(MainActivity.this,"返回数据为空",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(int statusCode, int errorCode, String msg) {
                Toast.makeText(MainActivity.this,msg+"--"+errorCode,Toast.LENGTH_SHORT).show();
            }
        });

        //创建实例
        AsyncHttpClient client=new AsyncHttpClient();
        //
        client.get(this, "", new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {

            }
        });


    }



}
