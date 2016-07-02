package fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import atguigu.com.cat.R;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import utils.GithubService;
import utils.HotData;

/**
 * Created by Administrator on 2016/6/30.
 */
public class HotFragment extends android.support.v4.app.Fragment {
    private RecyclerView mRecyclerView;
    private List<String> mDatas;
    private HotAdapter mAdapter;
    private boolean isConnect = false;
    HotData.DataBean dataBean;
    private View view;
    private final String HOTURL = "http://m.maoyan.com/";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.hotfragment, null);
        getHotDataFromNet();
        return view;
    }

    //這個方法是retrofit進行聯網
    private void getHotDataFromNet() {
        //创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOTURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GithubService service = retrofit.create(GithubService.class);
        Call<List<HotData.DataBean.MoviesBean>> call = service.getContributors("nm");


        call.enqueue(
                new Callback<List<HotData.DataBean.MoviesBean>>() {
                    @Override
                    public void onResponse(Response<List<HotData.DataBean.MoviesBean>> response,
                                           Retrofit retrofit) {
                        Log.e("TAG", "联网成功");
                          List<HotData.DataBean.MoviesBean> list=response.body();
//                            ProcessHotData();
//                initData();
//                mRecyclerView= (RecyclerView) view.findViewById(R.id.id_recyclerview);
//                mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//                mRecyclerView.setAdapter(mAdapter = new HotAdapter());
//                Log.e("TAG", "请求成功...result==" + result);
//                Log.e("TAG", "请求成功...");

                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                        Log.e("TAG", "联网失败");

                    }


                });
    }

    private void initData() {
        mDatas = new ArrayList<>();
        for (int i = 0; i < dataBean.getMovies().size(); i++) {
            mDatas.add(dataBean.getMovies().get(i).getNm());

        }
    }

    class HotAdapter extends RecyclerView.Adapter<HotAdapter.MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                    getContext()).inflate(R.layout.item_hot, parent,
                    false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.tv.setText(mDatas.get(position));
        }

        @Override
        public int getItemCount() {
            return mDatas.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            TextView tv;

            public MyViewHolder(View view) {
                super(view);
                tv = (TextView) view.findViewById(R.id.id_num);
            }
        }
    }
//这种方法会同时走成功失败两条路
//
//  private void getHotDataFromNet(){
//        RequestParams params =  new  RequestParams(Utils.HOTURL);
//        params.addQueryStringParameter("wd",  "xUtils");
//        x.http().get(params,  new  Callback.CommonCallback<String>() {
//            @Override
//            public void  onSuccess(String result) {
//                ProcessHotData(result);
//                initData();
//                mRecyclerView= (RecyclerView) view.findViewById(R.id.id_recyclerview);
//                mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//                mRecyclerView.setAdapter(mAdapter = new HotAdapter());
//                Log.e("TAG", "请求成功...result==" + result);
//                Log.e("TAG", "请求成功...");
//            }
//
//            @Override
//            public void  onError(Throwable ex,  boolean  isOnCallback) {
//                TextView t=new TextView(getContext());
//                t.setText("404-NOTFOUND");
//                view=t;
//                Toast.makeText(getContext(), "联网失败请检查您的网络状况", Toast.LENGTH_SHORT).show();
//
//                Log.e("TAG",  "请求onError....isOnCallback=="  + isOnCallback);
//            }
//
//            @Override
//            public void  onCancelled(CancelledException cex) {
//                TextView t=new TextView(getContext());
//                t.setText("404-NOTFOUND");
//                Toast.makeText(getContext(), "联网取消请检查您的网络状况", Toast.LENGTH_SHORT).show();
//                view=t;
//
//                Log.e("TAG","请求onCancelled....");
//            }
//
//            @Override
//            public void  onFinished() {
//                Log.e("TAG","请求完成....");
//            }
//        });
//
//    }

    private void ProcessHotData(String result) {
        Gson gson = new Gson();
        dataBean = gson.fromJson(result, HotData.DataBean.class);
        Log.e("TAG", "数据加载完成666....");


    }
}
