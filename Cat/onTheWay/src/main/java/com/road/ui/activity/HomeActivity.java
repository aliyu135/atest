package com.road.ui.activity;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import android.os.Bundle;
import android.view.View;

import com.road.bean.Page;
import com.road.bean.Res;
import com.road.service.GitHubService;
import com.road.utils.LogUtil;
import com.squareup.okhttp.OkHttpClient;
import com.zhou.ontheway.R;

public class HomeActivity extends BaseActivity {
	
	public static final String TAG = "HomeActivity";
	
	private View parentView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		parentView = View.inflate(mContext, R.layout.activity_home, null);
		setContentView(parentView);
		
		executeTask(new Runnable() {
			
			@Override
			public void run() {
//				postRequest();
				getRetrofit();
			}
		});

	}

	@Override
	protected View getApplicationView() {
		return parentView;
	}
	
	private void getRetrofit(){
		Retrofit retrofit = new Retrofit.Builder()
			.baseUrl("http://apis.baidu.com/showapi_open_bus/showapi_joke/")
			.addConverterFactory(GsonConverterFactory.create())
			.build();
		GitHubService service = retrofit.create(GitHubService.class);
		Page page = new Page();
		page.page = "1";
		retrofit.Call<Res> repos = service.getJoke("ffac023cd51e5d0430d6ceaecf623c2e", "1");
		repos.enqueue(new retrofit.Callback<Res>() {
			
			@Override
			public void onResponse(retrofit.Response<Res> response, Retrofit retrofit) {
				// TODO Auto-generated method stub
				Res body = response.body();
				LogUtil.i(TAG, body.toString());
				
			}
			
			@Override
			public void onFailure(Throwable throwable) {
				// TODO Auto-generated method stub
				System.out.println("");
			}
		});
	}
	
	
//	private void postRequest(){
//		FormEncodingBuilder builder = new FormEncodingBuilder();
//		builder.add("page", "1");
//		Request request = new Request.Builder().url(" http://apis.baidu.com/showapi_open_bus/showapi_joke/joke_text")
//				.addHeader("apikey", "ffac023cd51e5d0430d6ceaecf623c2e")
//				.post(builder.build()).build();
//
//		OkHttpClient mOkHttpClient = new OkHttpClient();
//		mOkHttpClient.newCall(request).enqueue(new Callback() {
//			
//			@Override
//			public void onResponse(Response res) throws IOException {
//				String string = res.body().string();
//				System.out.println("");
//				
//			}
//			
//			@Override
//			public void onFailure(Request arg0, IOException ex) {
//				// TODO Auto-generated method stub
//				ex.printStackTrace();
//				
//			}
//		});
//	}

}
