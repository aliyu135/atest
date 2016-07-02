package utils;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Administrator on 2016/7/2.
 */
public interface GithubService {
    //https://api.github.com/repos/{owner}/{repo}/contributors
//    @GET("/repos/{owner}/{repo}/contributors")
    @GET("movie/list.json?type=hot&offset=0&limit=1000/DataBean/nm")
    Call<List<HotData.DataBean.MoviesBean>> getContributors(
            @Query("nm") String name);
}

