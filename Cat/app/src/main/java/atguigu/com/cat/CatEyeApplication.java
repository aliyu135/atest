package atguigu.com.cat;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2016/7/1.
 */
public class CatEyeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);

    }
}
