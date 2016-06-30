package com.lidd.svgdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseFragmentActivity {

    private Button activity_main_show_svg_btn;
    @Override
    protected void initView() {

        setContentView(R.layout.activity_main);
        activity_main_show_svg_btn = findView(R.id.activity_main_show_svg_btn);


    }

    @Override
    protected void initData() {

    }

    @Override
    protected void addListener() {

        activity_main_show_svg_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.activity_main_show_svg_btn:
                startActivity(new Intent(mContext,ShowSampleActivity.class));
                break;

        }
    }
}
