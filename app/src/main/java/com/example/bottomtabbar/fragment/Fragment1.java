package com.example.bottomtabbar.fragment;

import android.util.Log;

import com.example.bottomtabbar.R;

public class Fragment1 extends LazyLoadFragment {
    @Override
    public int setContentView() {
        return R.layout.fm_layout1;
    }

    @Override
    protected void lazyLoad() {
        String message = "Fragment1";
        showToast(message);
        Log.d(TAG, message);
    }

    @Override
    protected void stopLoad() {
        Log.d(TAG, "Fragment1" + "已经对用户不可见，可以停止加载数据");
    }
}
