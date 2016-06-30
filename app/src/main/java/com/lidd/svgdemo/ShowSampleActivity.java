package com.lidd.svgdemo;

import android.view.View;
import android.widget.ImageView;

/**
 * Created by 李冬冬 on 2016/6/26.
 * note:
 * (1) 不是说VectorDrawable无论是在缩小还是在放大都不会损失图片质量吗？
 *     但是在我的手机（4.4）上放大VectorDrawable还是会损失质量？
 *     答：其实使用VectorDrawable分两种情况
 *     1、Android 5.0及其以上可以直接使用 Vector的有关API 没有任何问题
 *     2、Android 4.4及其以下就必须使用支持库来实现对Vector相关API的支持，但是这样也只是只是Vector的一部分API并不能全部支持，
 *     而原理是：svg会自动生成不同dpi的png图片。这样做的优点只是只需要提供一套svg格式的图片就行，等到程序编译的时候会自动在各个dpi中
 *     生成相应png图片
 *     自然对于固定的手机（Android 4.4 及其以下）放大的是PNG图片而不是矢量图，所以还是会损失质量。
 *     参考文档地址如下：
 *     Add Multi-Density Vector Graphics 文档地址 https://developer.android.com/studio/write/vector-asset-studio.html
 *
 *     补充：
 *     其实并不是上面上的那样子，在Android 4.4及其以下的版本的时候，首先一定要自己的Activity一定要继承AppCompatActivity 其次禁止生成png
 *
 * (2) 有关RTL LTR的问题 http://book.51cto.com/art/201311/418549.htm
 * (3) Android VectorDrawable api文档地址 https://developer.android.com/reference/android/graphics/drawable/VectorDrawable.html
 * (4) Andrid Working With Drawables 文档地址 https://developer.android.com/training/material/drawables.html
 * (5) Add Multi-Density Vector Graphics 文档地址 https://developer.android.com/studio/write/vector-asset-studio.html
 *
 * (6)总结比较全面的文档地址 https://laobie.github.io/android/2016/05/31/vectors-for-all-finally.html
 * (7)将svg格式的图片转换为VectorDrawable 地址 http://inloop.github.io/svg2android/
 * (8)material icons 地址 https://design.google.com/icons/
 */
public class ShowSampleActivity extends BaseFragmentActivity{

    private ImageView activity_show_sample_svg_24img,activity_show_sample_50svg_img,activity_show_sample_100svg_img,activity_show_sample_200svg_img;

    @Override
    protected void initView() {

        setContentView(R.layout.activity_show_sample_svg);
        activity_show_sample_svg_24img = findView(R.id.activity_show_sample_svg_24img);
        activity_show_sample_50svg_img = findView(R.id.activity_show_sample_50svg_img);
        activity_show_sample_100svg_img = findView(R.id.activity_show_sample_100svg_img);
        activity_show_sample_200svg_img = findView(R.id.activity_show_sample_200svg_img);



    }

    @Override
    protected void initData() {

//        activity_show_sample_svg_24img.setImageResource(R.drawable.ic_vector_3d);
//        activity_show_sample_50svg_img.setImageResource(R.drawable.ic_vector_3d);
//        activity_show_sample_100svg_img.setImageResource(R.drawable.ic_vector_3d);
//        activity_show_sample_200svg_img.setImageResource(R.drawable.ic_vector_3d);


    }

    @Override
    protected void addListener() {

    }

    @Override
    public void onClick(View v) {

    }

}
