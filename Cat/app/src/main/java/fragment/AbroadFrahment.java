package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import atguigu.com.cat.R;

/**
 * Created by Administrator on 2016/6/30.
 */
public class AbroadFrahment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.abroadfragment, null);
        return view;
    }
}
