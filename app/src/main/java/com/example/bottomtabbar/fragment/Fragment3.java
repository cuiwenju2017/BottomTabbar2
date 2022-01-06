package com.example.bottomtabbar.fragment;

import android.util.Log;

import com.example.bottomtabbar.R;

public class Fragment3 extends LazyLoadFragment {

    @Override
    public int setContentView() {
        return R.layout.fm_layout3;
    }

    @Override
    protected void lazyLoad() {
        String message = "Fragment3";
        showToast(message);
        Log.d(TAG, message);
    }
    @Override
    protected void stopLoad() {
        Log.d(TAG, "Fragment3" + "已经对用户不可见，可以停止加载数据");
    }
}
