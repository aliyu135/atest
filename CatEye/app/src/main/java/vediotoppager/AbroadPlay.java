package vediotoppager;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/6/25.
 */
public class AbroadPlay extends VedioTopBasePager {
    private TextView textView;
    public AbroadPlay(Activity tactivity) {
        super(tactivity);
    }

    @Override
    public View initTopView() {
        textView=new TextView(tactivity);
        textView.setTextSize(50);
        textView.setTextColor(Color.RED);
        textView.setGravity(Gravity.CENTER);

        return textView;
    }

    @Override
    public void initTopData() {
        super.initTopData();
        textView.setText("这是海外页面内容");
    }
}
