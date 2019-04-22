package com.example.samplehitapi;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.samplehitapi.api.ApiInterface;
import com.example.samplehitapi.pojo.DataPlnPrepaid;
import com.example.samplehitapi.pojo.ResponsePlnPrepaid;
import com.example.samplehitapi.pojo.TrxPlnPrepaid;
import com.example.samplehitapi.utils.Config;
import com.example.samplehitapi.utils.UtilsApi;
import com.example.samplehitapi.utils.UtilsService;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private UtilsService mService;

    @BindView(R.id.etIdpel) EditText etIdpel;
    @BindView(R.id.tvHasil) TextView tvHasil;

    ProgressDialog loading;
    Context mContext;
    ApiInterface mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mContext = this;
        mApiService = UtilsApi.getAPIService();

        final Button proses = (Button) findViewById(R.id.btnProses);
        proses.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                Random random = new Random();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

                String trxDate = sdf.format(new Date());
                String trxType = "2100"; // 2100 = inquiry, 2200 = payment
                String trxId = Integer.toString(random.nextInt(99999999));
                String custMsisdn = "";
                String custAccountNo = "01428800711";
                String prodId = "80"; // 80 = PLN Prepaid
                String prodNomination = "";
                String unsold = "";

                String username = Config.API_USER;
                String password = Config.API_PASS;
                String secretKey = Config.API_KEY;
                String signature = "";

                try {
                    signature = convertMD5(username + password + prodId + trxDate + secretKey);
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }

                String auth = "PELANGIREST username=" + username + "&password=" + password + "&signature=" + signature;

                executeTrxPlnPrepaid(auth, trxDate, trxType, trxId, custMsisdn, custAccountNo,
                        prodId, prodNomination, unsold);
            }
        });
    }

    private void executeTrxPlnPrepaid(String auth, String trxDate, String trxType, String trxId, String custMsisdn, String custAccountNo,
                                      String prodId, String prodNomination, String unsold) {
        loading = ProgressDialog.show(mContext, null, "Loading...", true, false);
        mService = new UtilsService();

        mService.trxPlnPrepaid(auth, trxDate, trxType, trxId, custMsisdn,
                custAccountNo, prodId, prodNomination, unsold, new Callback<ResponsePlnPrepaid>() {
            @Override
            public void onResponse(Call<ResponsePlnPrepaid> call, Response<ResponsePlnPrepaid> response) {
                loading.dismiss();

                DataPlnPrepaid dataResponse = response.body().getData();
//                TrxPlnPrepaid itemResponse = dataResponse.getTrx();
                Log.d("[x] Response", dataResponse.toString());

                Toast.makeText(getApplicationContext(), dataResponse.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                loading.dismiss();
                t.printStackTrace();
            }
        });
    }

    public String convertMD5(String x) throws NoSuchAlgorithmException {
        String result = "";
        MessageDigest md = MessageDigest.getInstance("MD5");

        md.update(x.getBytes());
        byte byteData[] = md.digest();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        result = sb.toString();
        return result;
    }

}
