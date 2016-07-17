package com.hg.justparktest.ui;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.hg.justparktest.MyApplication;
import com.hg.justparktest.R;
import com.hg.justparktest.model.request.Near;
import com.hg.justparktest.model.response.ResponseData;
import com.hg.justparktest.webservice.IWebService;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Inject
    IWebService mWebService;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getAPIComponent().inject(this);

        Near near = new Near();
        near.setLat(51.5560241);
        near.setLng(0.2817075);
        near.setDistance(50);

        Call<ResponseData> call = mWebService.performRegionSearch(near);
        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {

                //removeProgressDialog();
                //Log.i(getClass().getSimpleName(), response.errorBody().string());
                if(response.isSuccessful()){
                    Log.i(getClass().getSimpleName(), "Status Code = " + response.code());
                    Log.i(getClass().getSimpleName(), "size: " + response.body().getData().size());
                } else {
                    Log.i(getClass().getSimpleName(), "error with response " );
                }

            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {

                //removeProgressDialog();
                //call.request().body().
                Log.i("ERROR", "something went wrong");

            }
        });
    }

    protected void showProgressDialog(String title, String description) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(true);
        progressDialog.setTitle(title);
        progressDialog.setMessage(description);
        progressDialog.show();
    }

    protected void removeProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }
    }
}
