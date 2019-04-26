package com.example.pineone_report;

import android.util.Log;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.StringTokenizer;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpConnection {

    OkHttpClient client;

    public HttpConnection() {
        this.client = new OkHttpClient();
    }

    public void requestServerData(String url, Callback callback) {

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        client.newCall(request).enqueue(callback);
    }
}
