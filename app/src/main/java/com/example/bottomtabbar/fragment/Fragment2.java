package com.example.bottomtabbar.fragment;

import android.util.Log;

import com.example.bottomtabbar.R;

public class Fragment2 extends LazyLoadFragment {
    @Override
    public int setContentView() {
        return R.layout.fm_layout2;
    }

    @Override
    protected void lazyLoad() {
        String message = "Fragment2";
        showToast(message);
        Log.d(TAG, message);
    }
    @Override
    protected void stopLoad() {
        Log.d(TAG, "Fragment2" + "已经对用户不可见，可以停止加载数据");
    }
}
