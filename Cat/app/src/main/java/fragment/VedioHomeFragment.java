package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import java.util.ArrayList;

import adapter.VedioFragmentPagerAdapter;
import atguigu.com.cat.R;

/**
 * Created by Administrator on 2016/6/30.
 */
public class VedioHomeFragment extends Fragment {
    Fragment  hotFrahment, waiFrahment, abroadFrahment;
    private int lastpaperin=0;

    RadioGroup v_t_r;
    private ViewPager mPager;
    private int vedioposition;
    private ArrayList<Fragment> fragmentsList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vediofragmenthome, null);
       initRadioGroup(view);
        initViewPager(view);
        return view;
    }

    /**
     * 这个方法加载设置上面的三个热映，待映，海外
     * */
    private void initRadioGroup(View view) {
        v_t_r= (RadioGroup) view.findViewById(R.id.vedio_title_rg);
        v_t_r.check(R.id.vedio_title_hot);
        v_t_r.setOnCheckedChangeListener(new MyOnclickListener());

    }

    private void initViewPager(View parentView) {
        mPager = (ViewPager) parentView.findViewById(R.id.vPager);
        fragmentsList = new ArrayList<>();

        hotFrahment = new HotFragment();
        waiFrahment = new WaitFragment();
        abroadFrahment = new AbroadFrahment();

        fragmentsList.add(hotFrahment);
        fragmentsList.add(waiFrahment);
        fragmentsList.add(abroadFrahment);

        mPager.setAdapter(new VedioFragmentPagerAdapter(getChildFragmentManager(), fragmentsList));
        mPager.addOnPageChangeListener(new MyOnPageChangeListener());
        mPager.setCurrentItem(0);

    }

    private class MyOnclickListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId){
                case R.id.vedio_title_hot:
                    vedioposition=0;
                    break;
                case R.id.vedio_title_wait:
                    vedioposition=1;
                    break;
                case R.id.vedio_title_abroad:
                    vedioposition=2;
                    break;
            }
            mPager.setCurrentItem(vedioposition);
        }
    }
//这里省略animation不知能不能行
    private class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {
       
/**
 * arg0页面选择现在的页面，lastpaperin上次页面所在位置
 * 
 * */       
        @Override
        public void onPageSelected(int arg0) {
            switch (arg0) {
                case 0:
                    if (lastpaperin !=0) {

                        v_t_r.check(R.id.vedio_title_hot);

                    }
                    break;
                case 1:
                    if (lastpaperin !=1) {

                        v_t_r.check(R.id.vedio_title_wait);
                    }
                    break;
                case 2:
                    if (lastpaperin !=2) {


                        v_t_r.check(R.id.vedio_title_abroad);
                    }
                    break;
            }
            lastpaperin = arg0;

        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }

        @Override
        public void onPageScrollStateChanged(int arg0) {
        }
    }
}
