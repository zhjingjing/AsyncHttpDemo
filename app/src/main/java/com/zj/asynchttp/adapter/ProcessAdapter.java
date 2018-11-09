package com.zj.asynchttp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;

import com.zj.asynchttp.bean.CourierBean;
import com.zj.asynchttp.databinding.ItemProcessBinding;
/**
 * create by zj on 2018/11/9
 */
public class ProcessAdapter extends AbsRVAdapter<CourierBean.RouteBean,AbsRVAdapter.BindingViewHolder> {
    private Context context;
    public ProcessAdapter(Context context) {
        super(context);
        this.context=context;
    }

    @NonNull
    @Override
    public BindingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int pos) {
        ItemProcessBinding binding=ItemProcessBinding.inflate(mInflater,viewGroup,false);
        return new BindingViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BindingViewHolder mHolder, int pos) {

        ItemProcessBinding binding= (ItemProcessBinding) mHolder.mBinding;
        CourierBean.RouteBean bean= (CourierBean.RouteBean) getItem(pos);
        binding.setData(bean);
        binding.setPos(pos);



    }
}
