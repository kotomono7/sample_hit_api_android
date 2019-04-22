package com.example.samplehitapi.api;

import com.example.samplehitapi.pojo.ResponsePlnPrepaid;
import com.example.samplehitapi.utils.Config;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST(Config.API_DIR)
    @FormUrlEncoded
    Call<ResponsePlnPrepaid> trxPlnPrepaid(
            @Header("Authorization") String auth,
            @Field("trx_date") String trxDate,
            @Field("trx_type") String trxType,
            @Field("trx_id") String trxId,
            @Field("cust_msisdn") String custMsisdn,
            @Field("cust_account_no") String custAccountNo,
            @Field("product_id") String prodId,
            @Field("product_nomination") String prodNomination,
            @Field("unsold") String unsold
    );

}
