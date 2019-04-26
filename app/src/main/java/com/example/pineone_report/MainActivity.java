package com.example.pineone_report;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton floatingActionButton;
    Button button;

    ArrayList<RequestRecyclerViewItem> items;
    String[] spinner_items;
    HashMap<String, String> requestMap;
    LinearLayoutManager linearLayoutManager;
    RequestRecyclerViewAdapter adapter;
    RecyclerView recyclerView;

    String requestUrl;
    String baseUrl = "http://123.140.104.156:80/servlets/CommSvl_UX?";
    String params = "";
    String SA_ID;
    String STB_MAC;
    String CAT_ID;
    String DEFIN_FLAG;
    String LEVEL_GB;
    String CAT_GB;
    String ORDER_GB;
    String NET_TYP;
    String IS_UHD;
    String APP_TYPE;
    String PAGE_NO;
    String PAGE_CNT;
    String PAGE_IDX;
    String SERIES_NO;
    String QUICK_DIS_YN;
    String DEC_POS_YN;

    ServerParser serverParser = new ServerParser();
    String serverData;

    ServerCommand serverCommand;
    ArrayList<GetI30List> getI30Lists;
    ArrayList<GetI30ContList> getI30ContLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.floatingactionbutton);
        floatingActionButton.setOnClickListener(this);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);

        initRecyclerView();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(getIntent().getExtras() != null) {
            CAT_ID = getIntent().getExtras().getString("CAT_ID");

            int size = items.size();
            for(int i = size-1; i >= 0; i--) {
                items.remove(i);
            }
            adapter.notifyItemRangeRemoved(1, size-1);

            RecyclerView.ViewHolder holder = recyclerView.findViewHolderForAdapterPosition(0);
            Spinner spinner = (Spinner)holder.itemView.findViewById(R.id.spinner);
            EditText editText = (EditText)holder.itemView.findViewById(R.id.edittext);

            spinner.setSelection(2);
            editText.setText(CAT_ID);
        }
    }

    @Override
    public void onClick(View v) {
        if(v == floatingActionButton) {
            RequestRecyclerViewItem item = new RequestRecyclerViewItem();
            items.add(item);
            adapter.notifyItemInserted(items.size()-1);
        } else if(v == button) {
            requestMap = adapter.getRequestMap();

            if(requestMap.containsKey("SA_ID") && requestMap.containsKey("STB_MAC") && requestMap.containsKey("CAT_ID") && requestMap.containsKey("DEFIN_FLAG") && requestMap.containsKey("LEVEL_GB") && requestMap.containsKey("CAT_GB") && requestMap.containsKey("ORDER_GB") && requestMap.containsKey("NET_TYP") && requestMap.containsKey("IS_UHD") && requestMap.containsKey("PAGE_NO") && requestMap.containsKey("PAGE_CNT") && requestMap.containsKey("PAGE_IDX") && requestMap.containsKey("QUICK_DIS_YN")) {
                serverCommand = ServerCommand.SERVER_CMD_IMCS_GETI30LIST;
                requestServerData();
            } else if(requestMap.containsKey("SA_ID") && requestMap.containsKey("STB_MAC") && requestMap.containsKey("CAT_ID") && requestMap.containsKey("DEFIN_FLAG") && requestMap.containsKey("CAT_GB") && requestMap.containsKey("NET_TYP") && requestMap.containsKey("APP_TYPE") && requestMap.containsKey("PAGE_NO") && requestMap.containsKey("PAGE_CNT") && requestMap.containsKey("IS_UHD") && requestMap.containsKey("QUICK_DIS_YN")) {
                serverCommand = ServerCommand.SERVER_CMD_IMCS_GETI30CONTLIST;
                requestServerData();
            } else {
                Toast.makeText(this, "요청 파라미터를 잘못입력하였습니다.", Toast.LENGTH_SHORT).show();
                for ( String key : requestMap.keySet() ) {
                    Log.d("test", "key : " + key +" / value : " + requestMap.get(key));
                }
            }

            adapter.initRequestMap();
        }
    }

    public void initRecyclerView() {
        items = new ArrayList<RequestRecyclerViewItem>();
        spinner_items = getResources().getStringArray(R.array.spinner_items);

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        adapter = new RequestRecyclerViewAdapter(items, spinner_items);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void initParams() {
        switch(serverCommand) {
            case SERVER_CMD_IMCS_GETI30LIST:
                SA_ID = requestMap.get("SA_ID");
                STB_MAC = requestMap.get("STB_MAC");
                CAT_ID = requestMap.get("CAT_ID");
                DEFIN_FLAG = requestMap.get("DEFIN_FLAG");
                LEVEL_GB = requestMap.get("LEVEL_GB");
                CAT_GB = requestMap.get("CAT_GB");
                ORDER_GB = requestMap.get("ORDER_GB");
                NET_TYP = requestMap.get("NET_TYP");
                IS_UHD = requestMap.get("IS_UHD");
                PAGE_NO = requestMap.get("PAGE_NO");
                PAGE_CNT = requestMap.get("PAGE_CNT");
                PAGE_IDX = requestMap.get("PAGE_IDX");
                QUICK_DIS_YN = requestMap.get("QUICK_DIS_YN");

//                SA_ID = "500159620069";
//                STB_MAC = "54b2.0306.c698";
//                CAT_ID = "J6000";
//                DEFIN_FLAG = "1";
//                LEVEL_GB = "B";
//                CAT_GB = "I30";
//                ORDER_GB = "I";
//                NET_TYP = "02";
//                IS_UHD = "Y";
//                PAGE_NO = "1";
//                PAGE_CNT = "50";
//                PAGE_IDX = "2";
//                QUICK_DIS_YN = "Y";
                break;

            case SERVER_CMD_IMCS_GETI30CONTLIST:
                SA_ID = requestMap.get("SA_ID");
                STB_MAC = requestMap.get("STB_MAC");
                CAT_ID = requestMap.get("CAT_ID");
                DEFIN_FLAG = requestMap.get("DEFIN_FLAG");
                CAT_GB = requestMap.get("CAT_GB");
                NET_TYP = requestMap.get("NET_TYP");
                APP_TYPE = requestMap.get("APP_TYPE");
                PAGE_NO = requestMap.get("PAGE_NO");
                PAGE_CNT = requestMap.get("PAGE_CNT");
                IS_UHD = requestMap.get("IS_UHD");
                QUICK_DIS_YN = requestMap.get("QUICK_DIS_YN");

//                SA_ID = "500159620069";
//                STB_MAC = "54b2.0306.c698";
//                CAT_ID = "J6002";
//                DEFIN_FLAG = "1";
//                CAT_GB = "I30";
//                NET_TYP = "02";
//                APP_TYPE = "HUTA";
//                PAGE_NO = "1";
//                PAGE_CNT = "20";
//                IS_UHD = "Y";
//                QUICK_DIS_YN = "N";
                break;
        }
    }

    public String getCmd() {
        String cmd = "CMD=";
        switch(serverCommand) {
            case SERVER_CMD_IMCS_GETI30LIST:
                cmd += "getI30List";
                break;

            case SERVER_CMD_IMCS_GETI30CONTLIST:
                cmd += "getI30ContList";
                break;
        }
        return cmd;
    }

    public String getParam() {
        switch(serverCommand) {
            case SERVER_CMD_IMCS_GETI30LIST:
                params = "SA_ID=" + SA_ID + "|" +
                        "STB_MAC=" + STB_MAC + "|" +
                        "CAT_ID=" + CAT_ID + "|" +
                        "DEFIN_FLAG=" + DEFIN_FLAG + "|" +
                        "LEVEL_GB=" + LEVEL_GB + "|" +
                        "CAT_GB=" + CAT_GB + "|" +
                        "ORDER_GB=" + ORDER_GB + "|" +
                        "NET_TYP=" + NET_TYP + "|" +
                        "IS_UHD=" + IS_UHD + "|" +
                        "PAGE_NO=" + PAGE_NO + "|" +
                        "PAGE_CNT=" + PAGE_CNT + "|" +
                        "PAGE_IDX=" + PAGE_IDX + "|" +
                        "QUICK_DIS_YN=" + QUICK_DIS_YN + "|";
                params = "&PARAM=" + URLEncoder.encode(params);
                break;
            case SERVER_CMD_IMCS_GETI30CONTLIST:
                params = "SA_ID=" + SA_ID + "|" +
                        "STB_MAC=" + STB_MAC + "|" +
                        "CAT_ID=" + CAT_ID + "|" +
                        "DEFIN_FLAG=" + DEFIN_FLAG + "|" +
                        "CAT_GB=" + CAT_GB + "|" +
                        "NET_TYP=" + NET_TYP + "|" +
                        "APP_TYPE=" + APP_TYPE + "|" +
                        "PAGE_NO=" + PAGE_NO + "|" +
                        "PAGE_CNT=" + PAGE_CNT + "|" +
                        "IS_UHD=" + IS_UHD + "|" +
                        "SERIES_NO=" + SERIES_NO + "|" +
                        "QUICK_DIS_YN=" + QUICK_DIS_YN + "|" +
                        "DEC_POS_YN=" + DEC_POS_YN + "|";
                params = "&PARAM=" + URLEncoder.encode(params);
                break;
        }
        return params;
    }

    public void requestServerData() {
        initParams();
        requestUrl = baseUrl + getCmd() + getParam();

        Log.d("test", requestUrl);

        HttpConnection httpConnection = new HttpConnection();
        httpConnection.requestServerData(requestUrl, callback);
    }
    
    public void transmitServerData() {
        Intent intent;
        switch(serverCommand) {
            case SERVER_CMD_IMCS_GETI30LIST:
                intent = new Intent(this, ListViewActivity.class);
                intent.putParcelableArrayListExtra("GetI30Lists", getI30Lists);
                intent.putExtra("ServerCommand", serverCommand);
                startActivity(intent);
                break;

            case SERVER_CMD_IMCS_GETI30CONTLIST:
                intent = new Intent(this, ListViewActivity.class);
                intent.putParcelableArrayListExtra("GetI30ContLists", getI30ContLists);
                intent.putExtra("ServerCommand", serverCommand);
                startActivity(intent);
                break;
        }
    }

    public void parseServerData(Response response) {
        try {
            switch(serverCommand) {
                case SERVER_CMD_IMCS_GETI30LIST:
                    serverData = URLDecoder.decode(response.body().string());
                    getI30Lists = serverParser.getParseGetI30List(serverData);
                    transmitServerData();
                    break;

                case SERVER_CMD_IMCS_GETI30CONTLIST:
                    serverData = URLDecoder.decode(response.body().string());
                    serverData = serverData.substring(0, serverData.length()-1);
                    getI30ContLists = serverParser.getParseGetI30ContList(serverData);
                    transmitServerData();
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private final Callback callback = new Callback() {
        @Override
        public void onFailure(Call call, IOException e) {
            Log.d("test", "실패");
            Log.d("test", e.getMessage());
        }
        @Override
        public void onResponse(Call call, Response response) throws IOException {
            Log.d("test", "성공");
            parseServerData(response);
        }
    };
}
