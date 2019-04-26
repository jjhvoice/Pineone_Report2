package com.example.pineone_report;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class ListViewActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    FragmentManager manager;
    VerticalFragment verticalFragment;
    GridFragment gridFragment;
    R_VerticalFragment r_verticalFragment;
    R_HorizontalFragment r_horizontalFragment;
    HorizontalFragment horizontalFragment;

    ServerCommand serverCommand;
    ArrayList<GetI30List> getI30Lists;
    ArrayList<GetI30ContList> getI30ContLists;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        serverCommand = (ServerCommand)getIntent().getSerializableExtra("ServerCommand");
        initDatas();

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        manager = getSupportFragmentManager();
        verticalFragment = new VerticalFragment();
        gridFragment = new GridFragment();
        r_verticalFragment = new R_VerticalFragment();
        r_horizontalFragment = new R_HorizontalFragment();
        horizontalFragment = new HorizontalFragment();
    }

    public void initDatas() {
        switch(serverCommand) {
            case SERVER_CMD_IMCS_GETI30LIST:
                getI30Lists = getIntent().getParcelableArrayListExtra("GetI30Lists");
                bundle = new Bundle();
                bundle.putParcelableArrayList("GetI30Lists", getI30Lists);
                bundle.putSerializable("ServerCommand", serverCommand);
                break;

            case SERVER_CMD_IMCS_GETI30CONTLIST:
                getI30ContLists = getIntent().getParcelableArrayListExtra("GetI30ContLists");
                bundle = new Bundle();
                bundle.putParcelableArrayList("GetI30ContLists", getI30ContLists);
                bundle.putSerializable("ServerCommand", serverCommand);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        if(v == button1) {
            if(!verticalFragment.isVisible()) {
                verticalFragment.setArguments(bundle);
                FragmentTransaction ft = manager.beginTransaction();
                ft.replace(R.id.fragment_layout, verticalFragment);
                ft.commit();
            }
        } else if(v == button2) {
            if(!horizontalFragment.isVisible()) {
                horizontalFragment.setArguments(bundle);
                FragmentTransaction ft = manager.beginTransaction();
                ft.replace(R.id.fragment_layout, horizontalFragment);
                ft.commit();
            }
        } else if(v == button3) {
            if(!gridFragment.isVisible()) {
                gridFragment.setArguments(bundle);
                FragmentTransaction ft = manager.beginTransaction();
                ft.replace(R.id.fragment_layout, gridFragment);
                ft.commit();
            }
        } else if(v == button4) {
            if (!r_verticalFragment.isVisible()) {
                r_verticalFragment.setArguments(bundle);
                FragmentTransaction ft = manager.beginTransaction();
                ft.replace(R.id.fragment_layout, r_verticalFragment);
                ft.commit();
            }
        } else if(v == button5) {
            if (!r_horizontalFragment.isVisible()) {
                r_horizontalFragment.setArguments(bundle);
                FragmentTransaction ft = manager.beginTransaction();
                ft.replace(R.id.fragment_layout, r_horizontalFragment);
                ft.commit();
            }
        }
    }
}
