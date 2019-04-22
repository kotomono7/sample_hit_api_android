package com.example.samplehitapi.utils;

import com.example.samplehitapi.api.ApiInterface;

import static com.example.samplehitapi.utils.Config.BASE_URL;

public class UtilsApi {

    public static ApiInterface getAPIService(){
        return UtilsClient.getClient(BASE_URL).create(ApiInterface.class);
    }

}
