package com.lidd.svgdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by 李冬冬 on 2016/6/26.
 */
public abstract class BaseFragmentActivity extends AppCompatActivity implements View.OnClickListener{

    protected Context mContext = this;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        initData();
        addListener();

    }

    protected <T>T findView(int id){

        return (T)findViewById(id);
    }

    protected abstract void initView();
    protected abstract void addListener();
    protected abstract void initData();
}
