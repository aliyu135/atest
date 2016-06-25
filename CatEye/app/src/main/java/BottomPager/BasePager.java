package BottomPager;

import android.app.Activity;
import android.view.View;

/**
 * Created by Administrator on 2016/6/25.
 * 这是底部页面基类
 */
public  abstract class BasePager {
    public final Activity mActivity;
    public View rootView;
    public boolean isBaseInit=false;


    protected BasePager(Activity mActivity) {
        this.mActivity = mActivity;
        rootView=initView();
    }
    public abstract View initView();
    public void initData(){

    }
}
