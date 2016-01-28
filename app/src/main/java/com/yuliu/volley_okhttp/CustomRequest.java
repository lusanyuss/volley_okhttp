package com.yuliu.volley_okhttp;

import android.net.Uri;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.HttpHeaderParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomRequest extends Request<JSONObject> {


    private Listener<JSONObject> listener;
    private Map<String, String> params;

    public CustomRequest(String url, Map<String, String> params,
                         Listener<JSONObject> reponseListener, ErrorListener errorListener) {
        super(Method.GET, url, errorListener);
        this.listener = reponseListener;
        this.params = params;
        Log.v("yuliu", url + getUrlPath(params));
    }

    public CustomRequest(int method, String url, Map<String, String> params,
                         Listener<JSONObject> reponseListener, ErrorListener errorListener) {
        super(method, url, errorListener);
        this.listener = reponseListener;
        this.params = params;
        Log.v("yuliu", url + getUrlPath(params));

    }

    public Map<String, String> getParams()
            throws AuthFailureError {
        return params;
    }


    public static String getUrlPath(Map<String, String> params) {
        Iterator iter = params.entrySet().iterator();
        StringBuffer mBuffer = new StringBuffer();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            String val = Uri.encode((String) entry.getValue());
            mBuffer.append(key + "=" + val + "&");
        }
        if (mBuffer.length() > 0) {
            mBuffer.deleteCharAt(mBuffer.length() - 1);
            mBuffer.insert(0, "?");
        }
        return mBuffer.toString();
    }


    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> mHeaders = new HashMap<String, String>();
        mHeaders.put("Content-Type", "application/x-www-form-urlencoded");
        Log.v("yuliu", "mHeaders");
        return mHeaders;
    }

    @Override
    protected Response<JSONObject> parseNetworkResponse(NetworkResponse response) {
        try {
            String jsonString = new String(response.data,
                    HttpHeaderParser.parseCharset(response.headers));
            return Response.success(new JSONObject(jsonString),
                    HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JSONException je) {
            return Response.error(new ParseError(je));
        }
    }

    @Override
    protected void deliverResponse(JSONObject response) {
        listener.onResponse(response);
    }


}