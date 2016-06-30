package com.lidd.svgdemo;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by 李冬冬 on 2016/6/27.
 */
public class SvgAnimationActivity extends BaseFragmentActivity{

    private ImageView img_animated_vector;
    private Button btn_click_me;

    @Override
    protected void initView() {

        setContentView(R.layout.activity_animated_vector);
        btn_click_me = findView(R.id.btn_click_me);
        img_animated_vector = findView(R.id.img_animated_vector);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void addListener() {

        btn_click_me.setOnClickListener(this);

    }

    public void animateVector(){

        Drawable drawable = img_animated_vector.getDrawable();
        if (drawable instanceof Animatable){
            ((Animatable) drawable).start();
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_click_me:
                animateVector();
                break;
        }

    }


}
