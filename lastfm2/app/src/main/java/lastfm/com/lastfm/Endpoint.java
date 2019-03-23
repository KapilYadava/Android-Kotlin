package lastfm.com.lastfm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Endpoint {

    @GET("/2.0/?method=album.search&album=criminal&api_key=c3b522819f98239ec82a72a11d397899&format=json")
    Call<Result> getResult();
}