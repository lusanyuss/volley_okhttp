package com.yuliu.volley_okhttp;

import android.content.Context;
import android.support.annotation.NonNull;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

public class MyVolley {
    private static RequestQueue mRequestQueue;

    private MyVolley() {
        // no instances
    }

    public static void init(Context context) {
        mRequestQueue = Volley.newRequestQueue(context, new OkHttpStack(new OkHttpClient()));
    }

    public static RequestQueue getRequestQueue() {
        if (mRequestQueue != null) {
            return mRequestQueue;
        } else {
            throw new IllegalStateException("RequestQueue not initialized");
        }
    }


    public static void addRequest(@NonNull final Request<?> request) {
        getRequestQueue().add(request).setRetryPolicy(
                new DefaultRetryPolicy((int) TimeUnit.SECONDS.toMillis(20), DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                        DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

    }

    public static void addRequest(@NonNull final Request<?> request, @NonNull final String tag) {
        request.setTag(tag);
        addRequest(request);
    }

    public static void cancelRequest(@NonNull final String tag) {
        getRequestQueue().cancelAll(tag);
    }

}