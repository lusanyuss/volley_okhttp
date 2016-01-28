package com.yuliu.volley_okhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String urlString2 = "http://api.uhouzz.com/uhouzz2.8/index.php" + "/wechatapp/Region/index";
        final Map<String, String> params2 = new HashMap<String, String>();

        MyVolley.addRequest(
                new CustomRequest(urlString2, params2,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                Log.v("", response.toString());
                                /**************** ui代码 *****************/
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // stub
                    }
                }));


    }
}
