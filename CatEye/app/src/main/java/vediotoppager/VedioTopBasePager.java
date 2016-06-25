package vediotoppager;

import android.app.Activity;
import android.view.View;

/**
 * Created by Administrator on 2016/6/25.
 */
public abstract class VedioTopBasePager {
   public final Activity tactivity;
    public View topView;
    public boolean isInit=false;


    protected VedioTopBasePager(Activity tactivity) {
        this.tactivity = tactivity;
        topView=initTopView();
    }

    public abstract View initTopView();
    public void initTopData(){}

}
