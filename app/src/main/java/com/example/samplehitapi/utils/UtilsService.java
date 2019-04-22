package com.example.samplehitapi.utils;

import com.example.samplehitapi.BuildConfig;
import com.example.samplehitapi.api.ApiInterface;

import java.util.concurrent.TimeUnit;

import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UtilsService {

    private ApiInterface myApiInterface;

    public UtilsService() {
        OkHttpClient.Builder okhttpBuilder = new OkHttpClient().newBuilder();
        okhttpBuilder.connectTimeout(60, TimeUnit.SECONDS);
        okhttpBuilder.writeTimeout(60, TimeUnit.SECONDS);
        okhttpBuilder.readTimeout(60, TimeUnit.SECONDS);
        okhttpBuilder.retryOnConnectionFailure(true);

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            okhttpBuilder.addInterceptor(interceptor);
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Config.BASE_URL)
                .client(okhttpBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        myApiInterface = retrofit.create(ApiInterface.class);
    }

    public void trxPlnPrepaid(String auth, String trxDate, String trxType, String trxId, String custMsisdn, String custAccountNo,
                              String prodId, String prodNomination, String unsold, Callback callback) {
        myApiInterface.trxPlnPrepaid(auth, trxDate, trxType, trxId, custMsisdn,
                custAccountNo, prodId, prodNomination, unsold).enqueue(callback);
    }

}
