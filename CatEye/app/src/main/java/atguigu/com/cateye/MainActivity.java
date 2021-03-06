package atguigu.com.cateye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import bottompager.BasePager;
import bottompager.CinemaPager;
import bottompager.FindPager;
import bottompager.MinePager;
import bottompager.VedioPager;

public class MainActivity extends FragmentActivity {
//    这是底部切换不同的页面类的集合
List<BasePager> pagerList;
    RadioGroup bottom_rg;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        bottom_rg= (RadioGroup) findViewById(R.id.rg);
        pagerList=new ArrayList<>();
        initData();
    }
/**
 * 这个方法用来初始化页面的数据
 * */
    private void initData(){
        pagerList.add(new VedioPager(this));
        pagerList.add(new CinemaPager(this));
        pagerList.add(new FindPager(this));
        pagerList.add(new MinePager(this));
        bottom_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    default:
                        position = 0;
                        break;

                    case R.id.cinema:
                        position = 1;
                        break;
                    case R.id.find:
                        position = 2;
                        break;
                    case R.id.mine:
                        position = 3;
                        break;
                }
                setFragment();
            }
        });
        bottom_rg.check(R.id.vedio);

    }
/**
 * 这是实现切换页面的方法
 * */
    private void setFragment() {
        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.bottom_bg_fl, new Fragment() {
            @Nullable
            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                BasePager b = getBasePager();
                if (b != null) {
                    ViewGroup v = (ViewGroup) b.rootView.getParent();
                    if (v != null) {
                        v.removeAllViewsInLayout();
                    }
                    return b.rootView;
                } else {
                    return null;
                }

            }
        });
        ft.commit();


    }

    private BasePager getBasePager() {
        BasePager base=pagerList.get(position);
        if(base!=null&&!base.isBaseInit) {
            base.isBaseInit=true;
            base.initData();
        }


        return base;


    }

}
