package com.yuliu.volley_okhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String urlString2 = "/wechatapp/Region/index";
        final Map<String, String> params2 = new HashMap<String, String>();

        MyVolley.addRequest(
                new CustomRequest("http://api.uhouzz.com/uhouzz2.8/index.php" + urlString2, JsonModel.class, params2,
                        new Response.Listener<JsonModel>() {
                            @Override
                            public void onResponse(JsonModel response) {
                                Log.v(TAG, response.code+"");
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                    }
                }));


    }
}
