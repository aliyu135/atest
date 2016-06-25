package bottompager;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import atguigu.com.cateye.R;
import vediotoppager.AbroadPlay;
import vediotoppager.HotPlay;
import vediotoppager.VedioTopBasePager;
import vediotoppager.WaitPlay;

/**
 * Created by Administrator on 2016/6/25.
 * 电影页面类
 */
public class VedioPager extends BasePager {
    List<VedioTopBasePager> topBasePagers;
    RadioGroup vedio_top_rg;
    int tposition;
    View contentView;
    VedioTopBasePager base;
    public VedioPager(Activity mActivity) {
        super(mActivity);
    }

    @Override
    public View initView() {

                return contentView;
    }

    private void setTopFragment() {
        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.bottom_bg_fl, new Fragment() {
            @Nullable
            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                VedioTopBasePager b = getTopPager();
                if (b != null) {
                    ViewGroup v = (ViewGroup) b.topView.getParent();
                    if (v != null) {
                        v.removeAllViewsInLayout();
                    }
                    contentView=b.topView;
                    return b.topView;
                } else {
                    contentView=null;
                    return null;
                }

            }
        });
        ft.commit();




    }

    private  VedioTopBasePager getTopPager() {

        base=topBasePagers.get(tposition);
        if(base!=null&&!base.isInit) {
            base.isInit=true;
            base.initTopData();
        }
           return base;
    }

    @Override
    public void initData() {
        super.initData();
        View v=View.inflate(mActivity, R.layout.vedio_top,null);
        vedio_top_rg = (RadioGroup) v.findViewById(R.id.vedio_title_rg);
        topBasePagers=new ArrayList<>();
        topBasePagers.add(new HotPlay(mActivity));
        topBasePagers.add(new WaitPlay(mActivity));
        topBasePagers.add(new AbroadPlay(mActivity));
        vedio_top_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    default:
                        tposition = 0;
                        break;

                    case R.id.vedio_title_wait:
                        tposition = 1;
                        break;
                    case R.id.vedio_title_abroad:
                        tposition = 2;
                        break;
                }
                setTopFragment();

            }
        });
        vedio_top_rg.check(R.id.vedio_title_hot);
    }
}
