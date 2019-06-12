package com.enstudio.halodoc.Config;


import com.enstudio.halodoc.model.user;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BaseAPIService {

    @GET("/api/v1/search")
    Call<user> getUser(
            @Path("author") String author
    );


}
