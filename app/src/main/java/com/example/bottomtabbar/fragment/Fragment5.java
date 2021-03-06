package com.example.bottomtabbar.fragment;

import android.util.Log;

import com.example.bottomtabbar.R;

public class Fragment5 extends LazyLoadFragment {
    @Override
    public int setContentView() {
        return R.layout.fm_layout5;
    }

    @Override
    protected void lazyLoad() {
        String message = "Fragment5" + (isInit ? "已经初始并已经显示给用户可以加载数据" : "没有初始化不能加载数据") + ">>>>>>>>>>>>>>>>>>>";
        showToast(message);
        Log.d(TAG, message);
    }

    @Override
    protected void stopLoad() {
        Log.d(TAG, "Fragment5" + "已经对用户不可见，可以停止加载数据");
    }
}
