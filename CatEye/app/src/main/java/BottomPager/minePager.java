package BottomPager;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/6/25.
 * 这是“我的“页面类
 */
public class minePager extends BasePager {
    private TextView textView;
    public minePager(Activity mActivity) {
        super(mActivity);
    }

    @Override
    public View initView() {
        textView=new TextView(mActivity);
        textView.setTextSize(50);
        textView.setTextColor(Color.RED);
        textView.setGravity(Gravity.CENTER);

        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        textView.setText("这是我的页面内容");
    }

}
