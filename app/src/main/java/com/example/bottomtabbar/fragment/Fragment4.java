package com.example.bottomtabbar.fragment;

import android.util.Log;

import com.example.bottomtabbar.R;

public class Fragment4 extends LazyLoadFragment {

    @Override
    public int setContentView() {
        return R.layout.fm_layout4;
    }

    @Override
    protected void lazyLoad() {
        String message = "Fragment4";
        showToast(message);
        Log.d(TAG, message);
    }
    @Override
    protected void stopLoad() {
        Log.d(TAG, "Fragment4" + "已经对用户不可见，可以停止加载数据");
    }
}
