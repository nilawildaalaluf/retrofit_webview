package com.enstudio.halodoc.Config;

public class Config {
    public static final String BASE_URL_API ="https://hn.algolia.com";

    public static BaseAPIService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseAPIService.class);
    }

}
