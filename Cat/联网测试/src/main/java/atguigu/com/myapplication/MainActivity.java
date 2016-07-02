package atguigu.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Map<String,String> map=new HashMap<>();
    String url="http://api.k780.com:88/?app=idcard.get";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send= (Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendGet();
            }
        });
    }

    private void sendGet() {
        //本get请求来自于免费测试接口：http://www.k780.com/api/entry.baiduString url="http://api.k780.com:88/?app=idcard.get";

        map.put("appkey", "10003");
        map.put("sign", "b59bc3ef6191eb9f747dd4e83c99f2a4");
        map.put("format", "json");
        map.put("idcard", "110101199001011114");
        XUtils.Get(url, map, new MyCallBack<PersonInfoBean>(){

            @Override
            public void onSuccess(PersonInfoBean result) {
                super.onSuccess(result);
                Log.e("TAG", result.toString());
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                super.onError(ex, isOnCallback);
                Log.e("TAG", "send请求发送失败");
            }
        });

    }



}
